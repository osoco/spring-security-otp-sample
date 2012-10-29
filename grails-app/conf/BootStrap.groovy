import es.osoco.grails.plugins.otp.sample.Role
import es.osoco.grails.plugins.otp.sample.User
import es.osoco.grails.plugins.otp.sample.UserRole

class BootStrap {

    def init = { servletContext ->
        def adminRole = new Role(authority: 'ROLE_ADMIN').save()
        def admin = new User(username: 'admin', password: 'admin', secretKey: 'MZXW633PN5XW6MZX', enabled: true).save()
        UserRole.create admin, adminRole
    }

    def destroy = {
    }

}
