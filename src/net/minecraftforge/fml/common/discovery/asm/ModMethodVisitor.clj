(ns net.minecraftforge.fml.common.discovery.asm.ModMethodVisitor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery.asm ModMethodVisitor]))

(defn ->mod-method-visitor
  "Constructor.

  name - `java.lang.String`
  desc - `java.lang.String`
  discoverer - `net.minecraftforge.fml.common.discovery.asm.ASMModParser`"
  (^ModMethodVisitor [^java.lang.String name ^java.lang.String desc ^net.minecraftforge.fml.common.discovery.asm.ASMModParser discoverer]
    (new ModMethodVisitor name desc discoverer)))

(defn visit-annotation
  "annotation-name - `java.lang.String`
  runtime-visible - `boolean`

  returns: `org.objectweb.asm.AnnotationVisitor`"
  (^org.objectweb.asm.AnnotationVisitor [^ModMethodVisitor this ^java.lang.String annotation-name ^Boolean runtime-visible]
    (-> this (.visitAnnotation annotation-name runtime-visible))))

