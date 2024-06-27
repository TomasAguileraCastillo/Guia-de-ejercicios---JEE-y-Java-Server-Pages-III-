<%@page import="cl.desafiolatam.model.Evento"%>
<%@page import="cl.desafiolatam.business.EventoBusiness"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// Recepcion valores dede request
	int idEvento = Integer.parseInt(request.getParameter("idevento"));
	// Librerias requeridas
	EventoBusiness eventob = new EventoBusiness();
	// Crea Evento
	Evento evento = new Evento();
	evento.setId(idEvento);
	// Busca evento
	evento = eventob.getEventobyID(evento);
%>
<!DOCTYPE html>
<html lang="es">
	<%@include file="assets/html/headd.jsp"%>
	<body>
		<%@include file="assets/html/header.jsp"%>
		<!-- Section-->
		<section class="py-5">
			<div class="container px-4 px-lg-5 mt-5">
				<div class="row justify-content-center">
					<h1>Detalle Evento: 
						<strong><%=evento.getNombre()%></strong>
					</h1>
					<hr/ >
				</div>
			</div>
			<div class="container px-4 px-lg-5 mt-5">
				<img class="card-img-top" src="<%=evento.getImagen()%>"	alt="<%=evento.getNombre()%>" />
				<hr />
				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Item</th>
							<th scope="col">Valor</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th scope="row">1</th>
							<td>Nombre Evento</td>
							<td><%=evento.getNombre()%></td>
						</tr>
						<tr>
							<th scope="row">2</th>
							<td>Descripción</td>
	
							<td><%=evento.getDescripcion()%></td>
						</tr>
						<tr>
							<th scope="row">3</th>
							<td>Precio</td>
							<td>CL$ <%=evento.getPrecio()%></td>
						</tr>
						<tr>
							<th scope="row">4</th>
							<td>Lugar</td>
							<td><%=evento.getLugar()%></td>
						</tr>
						<tr>
							<th scope="row">5</th>
							<td>Ver Mapa</td>
							<td>
								<a href="mapa.jsp?idevento=<%=evento.getId()%>" class="btn btn-outline-dark mt-auto">Ver Mapa</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</section>
		<br /><br />
		<%@include file="assets/html/footer.jsp"%>
	</body>
</html>



