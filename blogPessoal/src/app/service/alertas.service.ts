import { AlertasComponent } from './../alertas/alertas.component';
import { Injectable } from '@angular/core';
import { BsModalRef, BsModalService } from 'ngx-bootstrap/modal';

@Injectable({
  providedIn: 'root'
})
export class AlertasService {

  constructor(
    private bsModalService: BsModalService
  ) { }

  private showAlert(message: string, type: string) {
    const bsModalRef: BsModalRef = this.bsModalService.show(AlertasComponent)
    bsModalRef.content.type = type
    bsModalRef.content.message = message
  }

  showAlertDanger(message: string) {
    this.showAlert(message, 'danger')
  }

  showAlertSucess(message: string) {
    this.showAlert(message, 'success')
  }

  showAlertWarning(message: string) {
    this.showAlert(message, 'warning')
  }
}
