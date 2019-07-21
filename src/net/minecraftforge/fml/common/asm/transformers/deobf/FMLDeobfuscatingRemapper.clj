(ns net.minecraftforge.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers.deobf FMLDeobfuscatingRemapper]))

(def *-instance
  "Static Constant.

  type: net.minecraftforge.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper"
  FMLDeobfuscatingRemapper/INSTANCE)

(defn map
  "type-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLDeobfuscatingRemapper this ^java.lang.String type-name]
    (-> this (.map type-name))))

(defn get-obfed-classes
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^FMLDeobfuscatingRemapper this]
    (-> this (.getObfedClasses))))

(defn map-field-name
  "owner - `java.lang.String`
  name - `java.lang.String`
  desc - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLDeobfuscatingRemapper this ^java.lang.String owner ^java.lang.String name ^java.lang.String desc]
    (-> this (.mapFieldName owner name desc))))

(defn unmap
  "type-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLDeobfuscatingRemapper this ^java.lang.String type-name]
    (-> this (.unmap type-name))))

(defn map-method-name
  "owner - `java.lang.String`
  name - `java.lang.String`
  desc - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLDeobfuscatingRemapper this ^java.lang.String owner ^java.lang.String name ^java.lang.String desc]
    (-> this (.mapMethodName owner name desc))))

(defn map-signature
  "signature - `java.lang.String`
  type-signature - `boolean`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLDeobfuscatingRemapper this ^java.lang.String signature ^Boolean type-signature]
    (-> this (.mapSignature signature type-signature))))

(defn setup
  "mc-dir - `java.io.File`
  class-loader - `net.minecraft.launchwrapper.LaunchClassLoader`
  deobf-file-name - `java.lang.String`"
  ([^FMLDeobfuscatingRemapper this ^java.io.File mc-dir ^net.minecraft.launchwrapper.LaunchClassLoader class-loader ^java.lang.String deobf-file-name]
    (-> this (.setup mc-dir class-loader deobf-file-name))))

(defn setup-load-only
  "deobf-file-name - `java.lang.String`
  load-all - `boolean`"
  ([^FMLDeobfuscatingRemapper this ^java.lang.String deobf-file-name ^Boolean load-all]
    (-> this (.setupLoadOnly deobf-file-name load-all))))

(defn get-static-field-type
  "old-type - `java.lang.String`
  old-name - `java.lang.String`
  new-type - `java.lang.String`
  new-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLDeobfuscatingRemapper this ^java.lang.String old-type ^java.lang.String old-name ^java.lang.String new-type ^java.lang.String new-name]
    (-> this (.getStaticFieldType old-type old-name new-type new-name))))

(defn remapped-class?
  "class-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FMLDeobfuscatingRemapper this ^java.lang.String class-name]
    (-> this (.isRemappedClass class-name))))

(defn merge-super-maps
  "name - `java.lang.String`
  super-name - `java.lang.String`
  interfaces - `java.lang.String[]`"
  ([^FMLDeobfuscatingRemapper this ^java.lang.String name ^java.lang.String super-name interfaces]
    (-> this (.mergeSuperMaps name super-name interfaces))))

