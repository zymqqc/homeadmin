/**
 * 全文检索
 */

/**
 * 根据条件查询，更新结果列表数据
 */
function jsSearch(){
	$.get("/com.zym/sear/"+$("#searchParam").val(),function(data){
		if(data.length>0){
			$(".labeanContens>tr").remove();
			var tbodychilds;
			$.each(data,function(key,labean){
				tbodychilds+="<tr>"
				tbodychilds+="<td>"+labean.laname+"</td>";
				tbodychilds+="<td>"+labean.createdate+"</td>";
				tbodychilds+="<td class='overview'>"+labean.overview+"</td>";
				tbodychilds+="<td>"+labean.detail+"</td>";
				tbodychilds+="</tr>";
			})
			$(".labeanContens").append(tbodychilds);
		}else{
			
		}
	})
}








