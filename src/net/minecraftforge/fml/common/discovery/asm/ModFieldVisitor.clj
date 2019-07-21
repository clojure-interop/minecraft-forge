(ns net.minecraftforge.fml.common.discovery.asm.ModFieldVisitor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery.asm ModFieldVisitor]))

(defn ->mod-field-visitor
  "Constructor.

  name - `java.lang.String`
  discoverer - `net.minecraftforge.fml.common.discovery.asm.ASMModParser`"
  (^ModFieldVisitor [^java.lang.String name ^net.minecraftforge.fml.common.discovery.asm.ASMModParser discoverer]
    (new ModFieldVisitor name discoverer)))

(defn visit-annotation
  "annotation-name - `java.lang.String`
  runtime-visible - `boolean`

  returns: `org.objectweb.asm.AnnotationVisitor`"
  (^org.objectweb.asm.AnnotationVisitor [^ModFieldVisitor this ^java.lang.String annotation-name ^Boolean runtime-visible]
    (-> this (.visitAnnotation annotation-name runtime-visible))))

