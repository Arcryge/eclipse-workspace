/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-09 11:26:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class item_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("- 达达</title>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar jdpts = new Object();\r\n");
      out.write("\tjdpts._st = new Date().getTime();\r\n");
      out.write("</script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/taotao.css\"\r\n");
      out.write("\tmedia=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/pshow.css\" media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.pageConfig = {\r\n");
      out.write("\t\tcompatible : true,\r\n");
      out.write("\t\tproduct : {\r\n");
      out.write("\t\t\tskuid : 1221882,\r\n");
      out.write("\t\t\tname : '\\u957f\\u8679\\uff08\\u0043\\u0048\\u0041\\u004e\\u0047\\u0048\\u004f\\u004e\\u0047\\uff09\\u004c\\u0045\\u0044\\u0034\\u0032\\u0035\\u0033\\u0038\\u0045\\u0053\\u0020\\u0034\\u0032\\u82f1\\u5bf8\\u0020\\u7a84\\u8fb9\\u84dd\\u5149\\u004c\\u0045\\u0044\\u6db2\\u6676\\u7535\\u89c6\\uff08\\u9ed1\\u8272\\uff09',\r\n");
      out.write("\t\t\tskuidkey : 'E804B1D153D29E36088A33A134D85EEA',\r\n");
      out.write("\t\t\thref : 'http://item.jd.com/1221882.html',\r\n");
      out.write("\t\t\tsrc : 'jfs/t304/157/750353441/93159/e4ee9876/54227256N20d4f5ec.jpg',\r\n");
      out.write("\t\t\tcat : [ 737, 794, 798 ],\r\n");
      out.write("\t\t\tbrand : 20710,\r\n");
      out.write("\t\t\tnBrand : 20710,\r\n");
      out.write("\t\t\ttips : false,\r\n");
      out.write("\t\t\ttype : 1,\r\n");
      out.write("\t\t\tvenderId : 0,\r\n");
      out.write("\t\t\tshopId : '0',\r\n");
      out.write("\t\t\tTJ : '0',\r\n");
      out.write("\t\t\tspecialAttrs : [ \"HYKHSP-0\", \"isHaveYB\", \"isSelfService-0\",\r\n");
      out.write("\t\t\t\t\t\"isWeChatStock-0\", \"isCanUseJQ\", \"isOverseaPurchase-0\",\r\n");
      out.write("\t\t\t\t\t\"YuShou\", \"is7ToReturn-1\", \"isCanVAT\" ],\r\n");
      out.write("\t\t\tvideoPath : '',\r\n");
      out.write("\t\t\tHM : '0'\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body version=\"140120\">\r\n");
      out.write("\t<!-- header start -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "commons/header.jsp", out, false);
      out.write("<!-- header end -->\r\n");
      out.write("\t<div class=\"w\">\r\n");
      out.write("\t\t<div id=\"product-intro\">\r\n");
      out.write("\t\t\t<div id=\"name\">\r\n");
      out.write("\t\t\t\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t\t\t\t<strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.sellPoint}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</strong>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--name end-->\r\n");
      out.write("\t\t\t<script type='text/javascript'>\r\n");
      out.write("\t\t\t\tvar warestatus = 1;\r\n");
      out.write("\t\t\t\tvar eleSkuIdKey = [];\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t<div class=\"clearfix\" clstag=\"shangpin|keycount|product|share\">\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\tpageConfig.product.marketPrice = '';\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t<ul id=\"summary\">\r\n");
      out.write("\t\t\t\t\t<li id=\"summary-price\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dt\">达&nbsp;达&nbsp;价：</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dd\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong class=\"p-price\" id=\"jd-price\">￥");
      if (_jspx_meth_fmt_005fformatNumber_005f0(_jspx_page_context))
        return;
      out.write("</strong> <a id=\"notice-downp\" href=\"#none\" target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclstag=\"shangpin|keycount|product|jiangjia\">(降价通知)</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li id=\"summary-market\"><div class=\"dt\">商品编号：</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dd\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"summary-grade\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dt\">商品评分：</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dd\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"star  sa0\"></span> <a href=\"#comment\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<!-- 商品评分-->\r\n");
      out.write("\t\t\t\t\t<li id=\"summary-stock\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dt\">配&nbsp;送&nbsp;至：</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dd\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"store-selector\" class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<b></b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"clr\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"close\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"$('#store-selector').removeClass('hover')\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!--store-selector end-->\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"store-prompt\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<!--store-prompt end--->\r\n");
      out.write("\t\t\t\t\t\t</div> <span class=\"clr\"></span>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li id=\"summary-service\" class=\"hide\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dt\">服&#x3000;&#x3000;务：</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dd\">由 达达 发货并提供售后服务。</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!--brand-bar-->\r\n");
      out.write("\t\t\t\t<ul id=\"choose\" clstag=\"shangpin|keycount|product|choose\">\r\n");
      out.write("\t\t\t\t\t<li id='choose-type'></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"choose-amount\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dt\">购买数量：</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dd\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn-reduce\" href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"setAmount.reduce('#buy-num')\">减少数量</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn-add\" href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"setAmount.add('#buy-num')\">增加数量</a> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text\" id=\"buy-num\" value=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonkeyup=\"setAmount.modify('#buy-num');\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li id=\"choose-result\"><div class=\"dt\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dd\"></div></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"choose-btns\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"choose-btn-append\" class=\"btn\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn-append \" id=\"InitCartUrl\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"/cart/add/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(".html\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclstag=\"shangpin|keycount|product|initcarturl\">加入购物车<b></b></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"choose-btn-easybuy\" class=\"btn\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"choose-btn-divide\" class=\"btn\"></div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!--choose end-->\r\n");
      out.write("\t\t\t\t<span class=\"clr\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"preview\">\r\n");
      out.write("\t\t\t\t<div id=\"spec-n1\" class=\"jqzoom\"\r\n");
      out.write("\t\t\t\t\tclstag=\"shangpin|keycount|product|spec-n1\">\r\n");
      out.write("\t\t\t\t\t<img data-img=\"1\" width=\"350\" height=\"350\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.images[0]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\talt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" jqimg=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.images[0]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"spec-list\" clstag=\"shangpin|keycount|product|spec-n5\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\" class=\"spec-control\" id=\"spec-forward\"></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\" class=\"spec-control\" id=\"spec-backward\"></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"spec-items\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"lh\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clb\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--preview end-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--product-intro end-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"w\">\r\n");
      out.write("\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t<div id=\"product-detail\" class=\"m m1\" data-widget=\"tabs\"\r\n");
      out.write("\t\t\t\tclstag=\"shangpin|keycount|product|detail\">\r\n");
      out.write("\t\t\t\t<div class=\"mt\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"tab\">\r\n");
      out.write("\t\t\t\t\t\t<li clstag=\"shangpin|keycount|product|pinfotab\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-widget=\"tab-item\" class=\"curr\"><a href=\"javascript:;\">商品介绍</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li clstag=\"shangpin|keycount|product|pcanshutab\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-widget=\"tab-item\"><a href=\"javascript:;\">规格参数</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li clstag=\"shangpin|keycount|product|packlisttab\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-widget=\"tab-item\"><a href=\"javascript:;\">包装清单</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li clstag=\"shangpin|keycount|product|pingjiatab\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-widget=\"tab-item\"><a href=\"javascript:;\">商品评价</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li clstag=\"shangpin|keycount|product|psaleservice\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-widget=\"tab-item\"><a href=\"javascript:;\">售后保障</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li clstag=\"shangpin|keycount|product|zhinan\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-widget='tab-item'><a href='javascript:;'>京博士</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mc\" data-widget=\"tab-content\" id=\"product-detail-1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"detail-correction\">\r\n");
      out.write("\t\t\t\t\t\t<b></b>如果您发现商品信息不准确，欢迎纠错\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"item-desc\" class=\"detail-content\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 商品描述 -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mc hide\" data-widget=\"tab-content\" id=\"product-detail-2\">\r\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itemParam}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t<div class=\"mc  hide\" data-widget=\"tab-content\"\r\n");
      out.write("\t\t\t\t\tid=\"product-detail-3\">\r\n");
      out.write("\t\t\t\t\t<div class=\"item-detail\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mc  hide\" data-widget=\"tab-content\"\r\n");
      out.write("\t\t\t\t\tid=\"product-detail-4\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"mc  hide\" data-widget=\"tab-content\"\r\n");
      out.write("\t\t\t\t\tid=\"product-detail-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"item-detail\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"product-detail-6\" class=\"mc hide\" data-widget=\"tab-content\"></div>\r\n");
      out.write("\t\t\t\t<!--知识库二级标签、标题-->\r\n");
      out.write("\t\t\t\t<div id=\"promises\">\r\n");
      out.write("\t\t\t\t\t<strong>服务承诺：</strong><br />\r\n");
      out.write("\t\t\t\t\t达达向您保证所售商品均为正品行货，达达自营商品开具机打发票或电子发票。凭质保证书及达达发票，可享受全国联保服务（奢侈品、钟表除外；奢侈品、钟表由达达联系保修，享受法定三包售后服务），与您亲临商场选购的商品享受相同的质量保证。达达还为您提供具有竞争力的商品价格和<a\r\n");
      out.write("\t\t\t\t\t\thref=\"http://www.jd.com/help/kdexpress.aspx\" target=\"_blank\">运费政策</a>，请您放心购买！\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t注：因厂家会在没有任何提前通知的情况下更改产品包装、产地或者一些附件，本司不能确保客户收到的货物与商城图片、产地、附件说明完全一致。只能确保为原厂正货！并且保证与当时市场上同样主流新品一致。若本商城没有及时更新，请大家谅解！\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"state\">\r\n");
      out.write("\t\t\t\t\t<strong>权利声明：</strong><br />达达上的所有商品信息、客户评价、商品咨询、网友讨论等内容，是达达重要的经营资源，未经许可，禁止非法转载使用。\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<b>注：</b>本站商品信息均来自于合作方，其真实性、准确性和合法性由信息拥有者（合作方）负责。本站不提供任何保证，并不承担任何法律责任。\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--product-detail end-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--right end-->\r\n");
      out.write("\t\t<span class=\"clr\"></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- footer start -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "commons/footer.jsp", out, false);
      out.write("<!-- footer end -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/jquery-1.6.4.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/lib-v1.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/product.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/iplocation_server.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar itemControl = {\r\n");
      out.write("\t\t\tparam : {\r\n");
      out.write("\t\t\t\tdescUrl : \"/item/desc/\",\r\n");
      out.write("\t\t\t\tparamUrl : \"/item/param/\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t//请求商品描述\r\n");
      out.write("\t\t\tgetItemDesc : function(itemId) {\r\n");
      out.write("\t\t\t\t$.get(itemControl.param.descUrl + itemId + \".html\", function(\r\n");
      out.write("\t\t\t\t\t\tdata) {\r\n");
      out.write("\t\t\t\t\t//返回商品描述的html，直接显示到页面\r\n");
      out.write("\t\t\t\t\t$(\"#item-desc\").append(data);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t//参数请求flag\r\n");
      out.write("\t\t\thaveParam : false,\r\n");
      out.write("\t\t\t//请求规格参数\r\n");
      out.write("\t\t\tgetItemParam : function(itemId) {\r\n");
      out.write("\t\t\t\t//如果没有查询过规格参数，就做请求\r\n");
      out.write("\t\t\t\tif (!itemControl.haveParam) {\r\n");
      out.write("\t\t\t\t\t$.get(itemControl.param.paramUrl + itemId + \".html\",\r\n");
      out.write("\t\t\t\t\t\t\tfunction(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t//返回商品规格的html，直接显示到页面\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#product-detail-2\").append(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t//更改flag状态\r\n");
      out.write("\t\t\t\t\t\t\t\titemControl.haveParam = true;\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t//取商品id\r\n");
      out.write("\t\t\tvar itemId = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\t//给商品规格参数tab页绑定事件\r\n");
      out.write("\t\t\t$(\"#p-con-attr\").bind(\"click\", function() {\r\n");
      out.write("\t\t\t\titemControl.getItemParam(itemId);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t//延迟一秒加载商品描述信息\r\n");
      out.write("\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\titemControl.getItemDesc(itemId);\r\n");
      out.write("\t\t\t}, 1000);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_005fformatNumber_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatNumber_005f0.setParent(null);
    // /WEB-INF/jsp/item.jsp(67,46) name = groupingUsed type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setGroupingUsed(false);
    // /WEB-INF/jsp/item.jsp(67,46) name = maxFractionDigits type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setMaxFractionDigits(2);
    // /WEB-INF/jsp/item.jsp(67,46) name = minFractionDigits type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setMinFractionDigits(2);
    // /WEB-INF/jsp/item.jsp(67,46) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.price / 100 }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatNumber_005f0 = _jspx_th_fmt_005fformatNumber_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/item.jsp(153,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/item.jsp(153,7) '${item.images}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${item.images}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/item.jsp(153,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("pic");
    // /WEB-INF/jsp/item.jsp(153,7) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/jsp/item.jsp(155,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index == 0 }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<li><img data-img=\"1\" class=\"img-hover\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\talt=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\" width=\"50\" height=\"50\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tdata-url=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"></li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<li><img data-img=\"1\" alt=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"50\" height=\"50\" data-url=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"></li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
