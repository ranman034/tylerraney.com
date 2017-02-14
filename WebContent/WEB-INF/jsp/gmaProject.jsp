<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Tyler Raney - GMA</title>

<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/resources/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">

<!-- Theme CSS -->
<link href="${pageContext.request.contextPath}/resources/css/grayscale.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- Bootstrap Image Gallery -->
<!--  <link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> -->
<link rel="stylesheet"
	href="//blueimp.github.io/Gallery/css/blueimp-gallery.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-image-gallery.min.css">
<base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

	<!-- Navigation -->
	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-main-collapse">
					Menu <i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand page-scroll" href="home"> <i
					class="fa fa-male"></i> <span class="light">Tyler</span>
					Raney
				</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div
				class="collapse navbar-collapse navbar-right navbar-main-collapse">
				<ul class="nav navbar-nav">
					<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
					<li class="hidden"><a href="#page-top"></a></li>
					<li name="navItems"><a class="page-scroll" href="#about">About</a></li>
					<li name="navItems"><a class="page-scroll" href="#photography">Photography</a>
					</li>
					<li id="projectDropdown">
					  <a class="page-scroll dropdown-toggle" href="#projects" id="dropdownMenuLink" data-target="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Projects</a>
					    <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
					      <a class="dropdown-item" href="vcciccProject">VCCICC</a><br>
					      <a class="dropdown-item" href="sirearmsProject">Sirearms</a><br>
					      <a class="dropdown-item" href="gmaProject">Green Mountain Armory</a><br>
                          <a class="dropdown-item" href="tylerRaneyProject">tylerraney.com</a><br>
                          <a class="dropdown-item" href="seniorProject">Senior Project</a>
                        </div>
                    </li>
					<li name="navItems"><a class="page-scroll" href="#contact">Contact</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

   <!-- Intro Header -->
    <header class="intro">
        <div class="intro-body">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                      <div class="rounded-section">
                        <h1 class="brand-heading">Green Mountain Armory</h1>
                        <h2>2016</h2>
				      </div>
<!-- 				      <a href="#explanation" class="btn btn-circle page-scroll">
                          <i class="fa fa-angle-double-down animated"></i>
                      </a> -->
                    </div>
                </div>
            </div>
        </div>
    </header>
    
	<!-- About Section -->
	<section id="explanation" class="container explaination-section text-center">
		<div class="row">
			<div class="col-lg-6">
				<div class="screenshots">
					<h1>Screenshots</h1>
					<div id="links">
						<a href="resources/img/gma/screenshot1.jpg"
							title="Screenshot 1" data-gallery> <img
							src="resources/img/gma/screenshot1.jpg" alt="Screenshot 1"
							height="100" width="100">
						</a> <a href="resources/img/gma/screenshot2.jpg"
							title="Screenshot 2" data-gallery> <img
							src="resources/img/gma/screenshot2.jpg" alt="Screenshot 2"
							height="100" width="100">
						</a>
					</div>
					<hr>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="description">
					<h1>Description</h1>
					<p>Redesigned the company website for Green Mountain Armory. 
					The site can be found <a href="http://www.greenmountainarmory.com/">here</a>.</p>
					<hr>
				</div>
			</div>
		</div>
	</section>

	<section id="explanation"
		class="container explaination-section-info text-center">
		<div class="row">
			<div class="col-lg-12 text-center">
				<div class="skills">
					<h1>Skills</h1>
					<ul>
						<li><strong>Front-end:</strong>&nbsp;Javascript,&nbsp;JQuery,&nbsp;HTML,&nbsp;CSS</li>
						<li><strong>Styling:</strong>&nbsp;
	                    <a href="http://getbootstrap.com/">Bootstrap</a>,&nbsp;
						<a href="https://startbootstrap.com/template-overviews/agency/">
						Agency</a>&nbsp;<br></li>
					</ul>
					<hr>
				</div>
			</div>
		</div>
	</section>

	<!-- The Bootstrap Image Gallery lightbox, should be a child element of the document body -->
	<div id="blueimp-gallery" class="blueimp-gallery"
		data-use-bootstrap-modal="false">
		<!-- The container for the modal slides -->
		<div class="slides"></div>
		<!-- Controls for the borderless lightbox -->
		<h3 class="title"></h3>
		<a class="prev">&#139;</a> <a class="next">&#155;</a> <a class="close">&#215;</a>
		<a class="play-pause"></a>
		<ol class="indicator"></ol>
		<!-- The modal dialog, which will be used to wrap the lightbox content -->
		<div class="modal fade">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" aria-hidden="true">&times;</button>
						<h4 class="modal-title"></h4>
					</div>
					<div class="modal-body next"></div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default pull-left prev">
							<i class="glyphicon glyphicon-chevron-left"></i> Previous
						</button>
						<button type="button" class="btn btn-primary next">
							Next <i class="glyphicon glyphicon-chevron-right"></i>
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<footer>
		<div class="container text-center">
			<p>Copyright &copy; Tyler Raney 2017</p>
		</div>
	</footer>

	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.js"></script>
	<!--  <script src="https://code.jquery.com/jquery-3.1.0.js"></script> -->
	<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
	<!-- <script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.5/jquery-ui.min.js'></script> -->

	<!-- Bootstrap Core JavaScript -->
	<script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    

	<!-- Theme JavaScript -->
	<script src="${pageContext.request.contextPath}/resources/js/grayscale.js"></script>

	<!-- Bootstrap Image Gallery -->
	<!--  <script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> -->
	<script
		src="//blueimp.github.io/Gallery/js/jquery.blueimp-gallery.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap-image-gallery.min.js"></script>
</body>

</html>
