<%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Tyler Raney - Home</title>

<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.css"
	rel="stylesheet">

<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.min.css"
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
				<a class="navbar-brand page-scroll" href="#page-top"> <i
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
					  <a class="page-scroll dropdown-toggle" href="#" id="dropdownMenuLink" data-target="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Projects</a>
					    <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                          <a class="dropdown-item" href="tylerRaneyProject">tylerraney.com</a>
                          <a class="dropdown-item" href="vcciccProject">VCCICC Project</a>
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
                        <a href="#about" class="btn btn-circle page-scroll">
                            <i class="fa fa-angle-double-down animated"></i>
                        </a>
					</div>
				</div>
			</div>
		</div>
	</header>

	<!-- About Section -->
	<section id="about" class="container content-section text-center">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<h2>About Tyler</h2>
				<p>
					Tyler Raney is a software developer and world traveler originally from Hartland, VT.
					He is a graduate from Northeastern University and has lived the majority of
					his adult live in Boston, MA and San Francisco, CA.  In his spare time he can be
					found consuming digital media, hiking, traveling, or learning something new.
				</p>
			</div>
		</div>
	</section>

	<!-- Photography Section -->
	<section id="photography" class="content-section text-center">
	<div class="photography-section">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<h2>Photography</h2>
				<p>
				    Pictures I have taken from my travels around the world.
				</p>
                <div id="photosDiv"></div>
                <hr>
				<input type="text" class="form-control" id="tokenfield-typeahead" value="${tags}" />
				
				<!-- The Bootstrap Image Gallery lightbox, should be a child element of the document body -->
				<div id="blueimp-gallery" class="blueimp-gallery" data-use-bootstrap-modal="false">
					<!-- The container for the modal slides -->
					<div class="slides"></div>
					<!-- Controls for the borderless lightbox -->
					<h3 class="title"></h3>
					<a class="prev">&#139;</a> <a class="next">&#155;</a> <a
						class="close">&#215;</a> <a class="play-pause"></a>
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
			</div>
		</div>
    </div>
	</section>

	<!-- Projects Section -->
	<section id="projects" class="content-section text-center">
		<div class="download-section">
			<div class="container">
				<div class="col-lg-8 col-lg-offset-2">
					<h2>Projects</h2>
					<ul class="list-inline">
					  <li><a href="tylerRaneyProject" class="btn btn-default btn-lg">TylerRaney.com</a>
					  </li>
					  <li><a href="vcciccProject"
						class="btn btn-default btn-lg">VCCICC Database</a>
					  </li>
					  <li><a href="seniorProject"
						class="btn btn-default btn-lg">Senior Project</a>
					  </li>
					</ul>
				</div>
			</div>
		</div>
	</section>

	<!-- Contact Section -->
	<section id="contact" class="container content-section text-center">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<h2>Contact Tyler Raney</h2>
				<p>Feel free to email me to say hello.</p>
				<p>
					<a href="mailto:tylergraney@gmail.com">tylergraney@gmail.com</a>
				</p>
				<ul class="list-inline banner-social-buttons">
					<li><a href="https://www.instagram.com/tylerranman/"
						class="btn btn-default btn-lg"><i
							class="fa fa-instagram fa-fw"></i> <span class="network-name">Instagram</span></a>
					</li>
					<li><a href="https://www.linkedin.com/in/tylerraney"
						class="btn btn-default btn-lg"><i class="fa fa-linkedin fa-fw"></i>
							<span class="network-name">Linkedin</span></a></li>
					<li><a
						href="https://github.com/ranman034"
						class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i>
							<span class="network-name">GitHub</span></a></li>
				</ul>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<footer>
		<div class="container text-center">
			<p>Copyright &copy; Tyler Raney 2016</p>
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
    
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-tokenfield.js"></script>
    
    <script src="${pageContext.request.contextPath}/resources/js/photo-tags.js"></script>
    
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
