(ns net.minecraftforge.fml.common.ModClassLoader
  "A simple delegating class loader used to load mods into the system"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ModClassLoader]))

(defn ->mod-class-loader
  "Constructor.

  parent - `java.lang.ClassLoader`"
  (^ModClassLoader [^java.lang.ClassLoader parent]
    (new ModClassLoader parent)))

(defn add-file
  "mod-file - `java.io.File`

  throws: java.net.MalformedURLException"
  ([^ModClassLoader this ^java.io.File mod-file]
    (-> this (.addFile mod-file))))

(defn load-class
  "name - `java.lang.String`

  returns: `java.lang.Class<?>`

  throws: java.lang.ClassNotFoundException"
  (^java.lang.Class [^ModClassLoader this ^java.lang.String name]
    (-> this (.loadClass name))))

(defn get-parent-sources
  "returns: `java.io.File[]`"
  ([^ModClassLoader this]
    (-> this (.getParentSources))))

(defn get-default-libraries
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ModClassLoader this]
    (-> this (.getDefaultLibraries))))

(defn default-library?
  "file - `java.io.File`

  returns: `boolean`"
  (^Boolean [^ModClassLoader this ^java.io.File file]
    (-> this (.isDefaultLibrary file))))

(defn clear-negative-cache-for
  "class-list - `java.util.Set`"
  ([^ModClassLoader this ^java.util.Set class-list]
    (-> this (.clearNegativeCacheFor class-list))))

(defn add-mod-api-transformer
  "data-table - `net.minecraftforge.fml.common.discovery.ASMDataTable`

  returns: `net.minecraftforge.fml.common.asm.transformers.ModAPITransformer`"
  (^net.minecraftforge.fml.common.asm.transformers.ModAPITransformer [^ModClassLoader this ^net.minecraftforge.fml.common.discovery.ASMDataTable data-table]
    (-> this (.addModAPITransformer data-table))))

(defn contains-source
  "source - `java.io.File`

  returns: `boolean`"
  (^Boolean [^ModClassLoader this ^java.io.File source]
    (-> this (.containsSource source))))

