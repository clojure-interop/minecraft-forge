(ns net.minecraftforge.fml.common.discovery.ModDiscoverer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery ModDiscoverer]))

(defn ->mod-discoverer
  "Constructor."
  (^ModDiscoverer []
    (new ModDiscoverer )))

(defn find-classpath-mods
  "mod-class-loader - `net.minecraftforge.fml.common.ModClassLoader`"
  ([^ModDiscoverer this ^net.minecraftforge.fml.common.ModClassLoader mod-class-loader]
    (-> this (.findClasspathMods mod-class-loader))))

(defn find-mod-dir-mods
  "mods-dir - `java.io.File`
  supplemental-mod-file-candidates - `java.io.File[]`"
  ([^ModDiscoverer this ^java.io.File mods-dir supplemental-mod-file-candidates]
    (-> this (.findModDirMods mods-dir supplemental-mod-file-candidates)))
  ([^ModDiscoverer this ^java.io.File mods-dir]
    (-> this (.findModDirMods mods-dir))))

(defn identify-mods
  "returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^ModDiscoverer this]
    (-> this (.identifyMods))))

(defn get-asm-table
  "returns: `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  (^net.minecraftforge.fml.common.discovery.ASMDataTable [^ModDiscoverer this]
    (-> this (.getASMTable))))

(defn get-non-mod-libs
  "returns: `java.util.List<java.io.File>`"
  (^java.util.List [^ModDiscoverer this]
    (-> this (.getNonModLibs))))

