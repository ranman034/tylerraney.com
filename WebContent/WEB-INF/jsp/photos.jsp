<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<div id="links">
<c:forEach items="${photos}" var="photograph"> 
  <a href="${photograph.photoLocation}" title="${photograph.title}"
      data-gallery> <img src="${photograph.thumbnailLocation}"
	  alt="${photograph.title}">
  </a>
</c:forEach>
</div>
