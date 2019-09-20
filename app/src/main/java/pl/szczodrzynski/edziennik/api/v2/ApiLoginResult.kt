package pl.szczodrzynski.edziennik.api.v2

import pl.szczodrzynski.edziennik.api.AppError
import pl.szczodrzynski.edziennik.datamodels.LoginStore

data class ApiLoginResult(val loginStore: LoginStore, val error: AppError?)