<%@ include file ="../common/header.jspf"%>
<%@ include file ="../common/navigation.jspf"%>

<style></style>

	<div class="container">
		<form action="/login.do" method="post">
			<p>
				<font color="red">${errorMessage}</font>
			</p>

			UserName: <input type="text" name="name" />Password: <input
				type="password" name="pass" /> <input type="submit" value="Login">
		</form>

	</div>

	
<%@ include file ="../common/footer.jspf"%>	






