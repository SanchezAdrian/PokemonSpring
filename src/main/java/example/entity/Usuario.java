package example.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Usuario {

	@Id
	@Column(name="username",unique=true,nullable=false, length=45)
	private String username;
	
	@Column(name="password",nullable=false, length=60)
	private String password;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="user")
	private Set<UsuarioRol> usuarioRol=new HashSet<UsuarioRol>();

	public Usuario() {}
	
	public Usuario(String username, String password, boolean enabled, Set<UsuarioRol> usuarioRol) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.usuarioRol = usuarioRol;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<UsuarioRol> getUsuarioRol() {
		return usuarioRol;
	}

	public void setUsuarioRol(Set<UsuarioRol> usuarioRol) {
		this.usuarioRol = usuarioRol;
	}
	
	
}
