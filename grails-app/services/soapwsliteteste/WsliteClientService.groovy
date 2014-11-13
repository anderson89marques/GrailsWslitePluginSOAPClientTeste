package soapwsliteteste

import wslite.soap.*

class WsliteClientService {

    def requisicaoSoap() {
		withSoap(serviceURL: 'http://www.holidaywebservice.com/Holidays/US/Dates/USHolidayDates.asmx'){
			def response = send(SOAPAction: 'http://www.27seconds.com/Holidays/US/Dates/GetMothersDay'){
				body {
					GetMothersDay(xmlns: 'http://www.27seconds.com/Holidays/US/Dates/') {
						year(2011)
					}
				}
			}

			println response.GetMothersDayResponse.GetMothersDayResult.text()
		}
    }
}
