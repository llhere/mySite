package com.example.demo.control;


import com.example.demo.util.IOUtil;
import com.example.demo.util.StringUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @Deacription
 * @Author chenpengwei
 * @Date 2019/12/11 下午 1:27
 * @Version 1.0
 **/
@Controller
public class PdfAndSignName {

    
    /**
     * @description 跳转手签名页面 
     * @author chenpengwei
     * @date 2019/12/11 下午 3:58
     */ 
    @RequestMapping("sign")
    public String SignName(){
        return "signName";
    }


    /**
     * @description 跳转博客模板界面
     * @author chenpengwei
     * @date 2019/12/11 下午 3:58
     */
    @RequestMapping("template")
    public String Template(Integer num){
        return "../static/template/" + num + "/index.html";
    }


    /**
     * @description 生成三张投保单pdf
     * @return java.lang.String
     * @author chenpengwei
     * @date 2019/12/11 下午 3:58
     */
    AcroFields acroFields; PdfReader reader; ByteArrayOutputStream bos; PdfStamper ps;
    @RequestMapping("make/pdf")
    public String makePdf(){

        try {

            //第一张pdf
            setAcroFields("D:/dzdzpt/upload/mb/DZTB/mbdz/单交强.pdf");
            acroFields.setField("${COMMERCIAL_POLICY_NO}", StringUtil.getNotNullStr("123ssssssssssssssssss"));
            acroFields.setField("${TRAVELTAX_POLICY_NO}", StringUtil.getNotNullStr("333"));
            outPdf("D:/mine/disktop/a- Disktop/Disktop/pdf/1.pdf");  //写出文件

            //第二张pdf
            setAcroFields("D:/dzdzpt/upload/mb/DZBD/000060/mbdz/syx_bdmb123.pdf");
            acroFields.setField("${INSUREDPOLICY_POLICY_INSURE_CODE}", StringUtil.getNotNullStr("123"));
            outPdf("D:/mine/disktop/a- Disktop/Disktop/pdf/2.pdf");  //写出文件

            //第三张pdf
            setAcroFields("D:/dzdzpt/upload/mb/DZBD/000060/mbdz/syxbd123456.pdf");
            acroFields.setField("${POLICY_NO}", StringUtil.getNotNullStr("456"));
            outPdf("D:/mine/disktop/a- Disktop/Disktop/pdf/3.pdf");  //写出文件


            //合成一张pdf
            ArrayList<String> fileList = new ArrayList<>();
            fileList.add("D:/mine/disktop/a- Disktop/Disktop/pdf/1.pdf");
            fileList.add("D:/mine/disktop/a- Disktop/Disktop/pdf/2.pdf");
            fileList.add("D:/mine/disktop/a- Disktop/Disktop/pdf/3.pdf");
            toOnePdf(fileList, "D:/mine/disktop/a- Disktop/Disktop/pdf/all.pdf");

        } catch (Exception e) {
            //LOG
        }

        return "pdf";
    }


    /**
     * @description 写出pdf并关闭IO
     * @Param [outFilePath 文件输出路径]
     * @return void
     * @author chenpengwei
     * @date 2019/12/11 下午 3:50
     */
    private void outPdf(String outFilePath){
        FileOutputStream fos = null;
        try {
            ps.setFormFlattening(true);
            ps.close();
            fos = new FileOutputStream(outFilePath);
            fos.write(bos.toByteArray());
        } catch (Exception e) {
            //LOG
        }finally {
            IOUtil.closeIOTmplates(fos, bos);
            if (null != reader) reader.close();
        }
    }


    /**
     * @description 设置类，获取模板所有字段
     * @Param [PdfReaderPath 模板文件路径]
     * @return com.itextpdf.text.pdf.AcroFields
     * @author chenpengwei
     * @date 2019/12/11 下午 4:27
     */
    public void setAcroFields(String PdfReaderPath){

        try {
            reader = new PdfReader(PdfReaderPath);
            bos = new ByteArrayOutputStream();
            ps = new PdfStamper(reader, bos);
            acroFields = ps.getAcroFields();
            //设置字体
            BaseFont baseFont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Map<String, AcroFields.Item> fields = acroFields.getFields();
            Iterator<Map.Entry<String, AcroFields.Item>> iterator = fields.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String, AcroFields.Item> next = iterator.next();
                acroFields.setFieldProperty(next.getKey(), "textfont", baseFont, null);
            }
        } catch (Exception e) {
            //LOG
        }
    }


    /**
     * @description 合成一张pdf
     * @Param [fileList 需要合成一张的pdf路径, savepath 合成之后输出的路径]
     * @return void
     * @author chenpengwei
     * @date 2019/12/11 下午 5:44
     */
    public static void toOnePdf(List<String> fileList, String savepath) {
        Document document = null;
        try {
            PdfReader pdfReader = new PdfReader(fileList.get(0));
            document = new Document(pdfReader.getPageSize(1));
            PdfCopy copy = new PdfCopy(document, new FileOutputStream(savepath));
            document.open();
            for (int i = 0; i < fileList.size(); i++) {
                PdfReader reader = new PdfReader(fileList.get(i));
                int n = reader.getNumberOfPages();// 获得总页码
                for (int j = 1; j <= n; j++) {
                    document.newPage();
                    PdfImportedPage page = copy.getImportedPage(reader, j);// 从当前Pdf,获取第j页
                    copy.addPage(page);
                }
                if (null != reader) reader.close();
            }
            if (null != pdfReader) pdfReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (document != null) {
                document.close();
            }
        }
    }

}
