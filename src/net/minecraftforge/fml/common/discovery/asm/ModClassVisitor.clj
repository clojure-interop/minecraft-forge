(ns net.minecraftforge.fml.common.discovery.asm.ModClassVisitor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery.asm ModClassVisitor]))

(defn ->mod-class-visitor
  "Constructor.

  discoverer - `net.minecraftforge.fml.common.discovery.asm.ASMModParser`"
  (^ModClassVisitor [^net.minecraftforge.fml.common.discovery.asm.ASMModParser discoverer]
    (new ModClassVisitor discoverer)))

(defn visit
  "version - `int`
  access - `int`
  name - `java.lang.String`
  signature - `java.lang.String`
  super-name - `java.lang.String`
  interfaces - `java.lang.String[]`"
  ([^ModClassVisitor this ^Integer version ^Integer access ^java.lang.String name ^java.lang.String signature ^java.lang.String super-name interfaces]
    (-> this (.visit version access name signature super-name interfaces))))

(defn visit-annotation
  "annotation-name - `java.lang.String`
  runtime-visible - `boolean`

  returns: `org.objectweb.asm.AnnotationVisitor`"
  (^org.objectweb.asm.AnnotationVisitor [^ModClassVisitor this ^java.lang.String annotation-name ^Boolean runtime-visible]
    (-> this (.visitAnnotation annotation-name runtime-visible))))

(defn visit-field
  "access - `int`
  name - `java.lang.String`
  desc - `java.lang.String`
  signature - `java.lang.String`
  value - `java.lang.Object`

  returns: `org.objectweb.asm.FieldVisitor`"
  (^org.objectweb.asm.FieldVisitor [^ModClassVisitor this ^Integer access ^java.lang.String name ^java.lang.String desc ^java.lang.String signature ^java.lang.Object value]
    (-> this (.visitField access name desc signature value))))

(defn visit-method
  "access - `int`
  name - `java.lang.String`
  desc - `java.lang.String`
  signature - `java.lang.String`
  exceptions - `java.lang.String[]`

  returns: `org.objectweb.asm.MethodVisitor`"
  (^org.objectweb.asm.MethodVisitor [^ModClassVisitor this ^Integer access ^java.lang.String name ^java.lang.String desc ^java.lang.String signature exceptions]
    (-> this (.visitMethod access name desc signature exceptions))))

