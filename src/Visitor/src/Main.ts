import { Excel } from "./Excel";
import { PDF } from "./PDF";
import { TamanhoArquivoVisitor } from "./TamanhoArquivoVisitor";
import { Word } from "./Word";

const documents = [
    new PDF(5),
    new Word(3),
    new Excel(8),
  ];
  
  const tamanhoArquivoVisitor = new TamanhoArquivoVisitor();
  
  documents.forEach((doc) => doc.accept(tamanhoArquivoVisitor));
  
  console.log(`Tamanho total dos documentos: ${tamanhoArquivoVisitor.tamanhoTotal} MB`);
