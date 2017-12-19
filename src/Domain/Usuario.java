package Domain;

public class Usuario {
	

	String nombre;
	String nick;
	String password;
	String telefono;
	String correo;
	String direccion;
	String pathToIcon;
	String ultimoAcceso;
	
	public Usuario(String nombre, String nick, String password, String telefono, String correo, String direccion, String path, String ultimoAcceso) {
		this.nombre = nombre;
		this.nick = nick;
		this.password = password;
		this.telefono = telefono;
		this.correo=correo;
		this.direccion = direccion;
		this.pathToIcon = path;
		this.ultimoAcceso=ultimoAcceso;
	}
	
	public Usuario() {
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUltimoAcceso() {
		return ultimoAcceso;
	}

	public void setUltimoAcceso(String ultimoAcceso) {
		this.ultimoAcceso = ultimoAcceso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPath() {
		return pathToIcon;
	}

	public void setPath(String path) {
		this.pathToIcon = path;
	}

	
	
}
