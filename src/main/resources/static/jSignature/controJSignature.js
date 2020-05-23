//声明签名时用到的div
var $sigDiv,      //签名插件初始化signature的div
    $toolsDiv,    //操作栏div
    $img;         //要设置图片的id，为null则alert（base64）

//窗体加载完后
$(function () {

    //初始化签名插件
    initJSignature('signature', 'tools', 'imgSrc');

});


//初始化
function initJSignature(jSignatureIdName, toolsIdName, imgSrc) {

    //初始化签名插件以及各个div
    initModule(jSignatureIdName, toolsIdName, imgSrc);

    //隐藏插件自带按钮，使用自己写的按钮模拟点击插件自带回退按钮，这样可以自定义按钮位置
    hiddenRegressionBtn();

    //工具div内添加操作按钮
    addOperaBtn();

    //快捷键
    bingShortKeys();

}


//初始化签名插件以及各个div
function initModule(jSignatureIdName, toolsIdName, imgSrc) {

    //签名插件初始化signature的div
    $sigDiv = $('#' + jSignatureIdName).jSignature({'UndoButton':true});
    //操作栏div
    $toolsDiv = $('#' + toolsIdName);
    //要设置图片的id，为null则alert（base64）
    $img = $('#' + imgSrc);
}


//隐藏回退按钮
function hiddenRegressionBtn() {

    $sigDiv.find('div:eq(1)').css({
        'display' : 'none'
    });
}


//添加操作按钮
function addOperaBtn() {

    //重置按钮
    $('<input type="button" value="重置">').bind('click', function(e){
        //重置图层和img标签
        $sigDiv.jSignature('reset');
        if ($img.length) $img.attr('src','');
    }).appendTo($toolsDiv);

    //回退按钮
    $('<input type="button" value="回退">').bind('click', function(e){
        $sigDiv.find('input').click();
    }).appendTo($toolsDiv);

    //获取image base64按钮
    $('<input type="button" value="获取Base64">').bind('click', function(e){
        if ($img.length)
            $img.attr('src', 'data:' + $sigDiv.jSignature('getData', 'image'));
        else
            alert('data:' + $sigDiv.jSignature('getData', 'image'));
    }).appendTo($toolsDiv);
}


//绑定快捷键
function bingShortKeys() {

    //Ctrl+Z 回退上一笔
    document.onkeydown = function(e){
        if (event.ctrlKey == true && event.keyCode == 90) {
            event.returnvalue = false;
            $sigDiv.find('input').click();
        }
    }
}