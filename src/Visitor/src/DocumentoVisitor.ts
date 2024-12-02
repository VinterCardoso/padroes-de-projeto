import { Excel } from "./Excel";
import { PDF } from "./PDF";
import { Word } from "./Word";

export interface DocumentoVisitor {
    visitPDF(documento: PDF): void;
    visitWord(documento: Word): void;
    visitExcel(documento: Excel): void;
}