import { DocumentoVisitor } from "./DocumentoVisitor";
import { Excel } from "./Excel";
import { PDF } from "./PDF";
import { Word } from "./Word";

export class TamanhoArquivoVisitor implements DocumentoVisitor {
    tamanhoTotal = 0;

    visitPDF(documento: PDF): void {
        this.tamanhoTotal += documento.size;
        console.log(`Tamanho do arquivo PDF: ${documento.size}MB`);
    }

    visitWord(documento: Word): void {
        this.tamanhoTotal += documento.size;
        console.log(`Tamanho do arquivo Word: ${documento.size}MB`);
    }

    visitExcel(documento: Excel): void {
        this.tamanhoTotal += documento.size;
        console.log(`Tamanho do arquivo Excel: ${documento.size}MB`);
    }
}