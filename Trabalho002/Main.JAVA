public class Main {

	public static void main(String[] args) {
		
		System.out.println("Formato em 24 horas");
		Horario hora = new Horario();
		hora.setHora(11);
		hora.setMinuto(30);
		Format<Horario> time = new TimeFormat();
		Display<Horario> relogio = new DisplayTime(hora, time);
		relogio.show();
		
		System.out.println("Formato DD/MM/YYYY");
		Calendario data = new Calendario();
		data.setAno(1999);
		data.setMes(09);
		data.setDia(03);
		Format<Calendario> calendario = new CalendarioFormat();
		Display<Calendario> display = new DisplayCalendario(data, calendario);
		display.show();
	}
}