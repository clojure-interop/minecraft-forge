(ns net.minecraftforge.fml.common.discovery.asm.ModAnnotationVisitor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery.asm ModAnnotationVisitor]))

(defn ->mod-annotation-visitor
  "Constructor.

  discoverer - `net.minecraftforge.fml.common.discovery.asm.ASMModParser`
  name - `java.lang.String`"
  (^ModAnnotationVisitor [^net.minecraftforge.fml.common.discovery.asm.ASMModParser discoverer ^java.lang.String name]
    (new ModAnnotationVisitor discoverer name))
  (^ModAnnotationVisitor [^net.minecraftforge.fml.common.discovery.asm.ASMModParser discoverer]
    (new ModAnnotationVisitor discoverer)))

(defn visit
  "key - `java.lang.String`
  value - `java.lang.Object`"
  ([^ModAnnotationVisitor this ^java.lang.String key ^java.lang.Object value]
    (-> this (.visit key value))))

(defn visit-enum
  "name - `java.lang.String`
  desc - `java.lang.String`
  value - `java.lang.String`"
  ([^ModAnnotationVisitor this ^java.lang.String name ^java.lang.String desc ^java.lang.String value]
    (-> this (.visitEnum name desc value))))

(defn visit-array
  "name - `java.lang.String`

  returns: `org.objectweb.asm.AnnotationVisitor`"
  (^org.objectweb.asm.AnnotationVisitor [^ModAnnotationVisitor this ^java.lang.String name]
    (-> this (.visitArray name))))

(defn visit-annotation
  "name - `java.lang.String`
  desc - `java.lang.String`

  returns: `org.objectweb.asm.AnnotationVisitor`"
  (^org.objectweb.asm.AnnotationVisitor [^ModAnnotationVisitor this ^java.lang.String name ^java.lang.String desc]
    (-> this (.visitAnnotation name desc))))

(defn visit-end
  ""
  ([^ModAnnotationVisitor this]
    (-> this (.visitEnd))))

