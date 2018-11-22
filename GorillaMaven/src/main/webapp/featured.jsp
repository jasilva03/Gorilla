<%@page import="org.ariel.response.Video"%>
<%@page import="org.ariel.service.VideoService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<title>GorillaLogic</title>
	</head>
	
	<body>
		
		<h1>Featured</h1>
		
		<table border=1>
			<%
			VideoService vs = new VideoService();
			List<Video> videos = vs.getVideos().getOutput();
			
			for(int i=0; i < videos.size(); i++){%>
				<tr>
					<td><img src="<%=videos.get(i).getThumbnail()%>"></td>
					<td><%=videos.get(i).getVideo_url()%></td>
				</tr>
			<%}%>
		</table>
		
		<br>
		<br>
		
		<a href="index.jsp">Back to Main Page</a>
		
	</body>
	
</html>
