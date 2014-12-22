$(function(){
  zblog.register("zblog.post");
  zblog.post.editor = UE.getEditor('container',{
	  autoHeightEnabled: true,
	  autoFloatEnabled: true
  });
  
  zblog.post.insert=function(){
	var title=$.trim($("#title").val());
	if(title==""){
	  $("#title").focus();
	  return ;
	}
	
	$.ajax({
      type:"POST",
      url:".",
      data:{title:title,txt:zblog.post.editor.getContentTxt(),
    	    content:zblog.post.editor.getContent(),
    	    categoryid:$("#category").val()},
      dateType:"json",
      success:function(data){
    	if(data&&data.success){
    	  window.location.href=".";
    	}else if(data){
    	  alert(data.msg);
    	}
      }
	});
  }
})