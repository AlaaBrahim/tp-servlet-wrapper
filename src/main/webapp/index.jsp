<html>
	<head>
		<!-- Titre de la page -->
		<title>ServletRequest Wrapper Demo</title>
	</head>

	<body>
		<!-- Message demandant à l'utilisateur d'entrer son nom -->
		<b> Please enter your name : ? </b>
		<br />
		<br />
		<br />

		<!-- Formulaire envoyé à la servlet "MyServ" lors de la soumission -->
		<form action="MyServ">
			<!-- Champ pour entrer le nom -->
			Name : <input type="text" name="username" />
			<!-- Champ pour entrer la ville -->
			City : <input type="text" name="cityname" />
			<!-- Bouton pour soumettre le formulaire -->
			<input type="submit" name="submit" />
		</form>
	</body>
</html>
