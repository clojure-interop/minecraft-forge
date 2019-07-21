(ns net.minecraftforge.fml.common.asm.transformers.deobf.FMLRemappingAdapter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers.deobf FMLRemappingAdapter]))

(defn ->fml-remapping-adapter
  "Constructor.

  cv - `org.objectweb.asm.ClassVisitor`"
  (^FMLRemappingAdapter [^org.objectweb.asm.ClassVisitor cv]
    (new FMLRemappingAdapter cv)))

(defn visit
  "version - `int`
  access - `int`
  name - `java.lang.String`
  signature - `java.lang.String`
  super-name - `java.lang.String`
  interfaces - `java.lang.String[]`"
  ([^FMLRemappingAdapter this ^Integer version ^Integer access ^java.lang.String name ^java.lang.String signature ^java.lang.String super-name interfaces]
    (-> this (.visit version access name signature super-name interfaces))))

(defn visit-field
  "access - `int`
  name - `java.lang.String`
  desc - `java.lang.String`
  signature - `java.lang.String`
  value - `java.lang.Object`

  returns: `org.objectweb.asm.FieldVisitor`"
  (^org.objectweb.asm.FieldVisitor [^FMLRemappingAdapter this ^Integer access ^java.lang.String name ^java.lang.String desc ^java.lang.String signature ^java.lang.Object value]
    (-> this (.visitField access name desc signature value))))

