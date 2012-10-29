/*
 * ====================================================================
 *    ____  _________  _________ 
 *   / __ \/ ___/ __ \/ ___/ __ \
 *  / /_/ (__  ) /_/ / /__/ /_/ /
 *  \____/____/\____/\___/\____/ 
 *
 *  ~ La empresa de los programadores profesionales ~
 *
 *  | http://osoco.es
 *  |
 *  | Edificio Moma Lofts
 *  | Planta 3, Loft 18
 *  | Ctra. Mostoles-Villaviciosa, Km 0,2
 *  | Mostoles, Madrid 28935 Spain
 *
 * ====================================================================
 *
 * Copyright 2012 OSOCO. All Rights Reserved.
 *
 */
package es.osoco.grails.plugins.otp.sample

import grails.plugins.springsecurity.Secured

class SampleController {

    def index() { }

    def any() {  

    }

    @Secured(['ROLE_ADMIN'])
    def admin() {  

    }

    @Secured(['ROLE_ADMIN', 'IS_AUTHENTICATED_OTP'])
    def otp() {  

    }

}
