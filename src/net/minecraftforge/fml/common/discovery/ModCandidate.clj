(ns net.minecraftforge.fml.common.discovery.ModCandidate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery ModCandidate]))

(defn ->mod-candidate
  "Constructor.

  class-path-root - `java.io.File`
  mod-container - `java.io.File`
  source-type - `net.minecraftforge.fml.common.discovery.ContainerType`
  is-minecraft - `boolean`
  classpath - `boolean`"
  (^ModCandidate [^java.io.File class-path-root ^java.io.File mod-container ^net.minecraftforge.fml.common.discovery.ContainerType source-type ^Boolean is-minecraft ^Boolean classpath]
    (new ModCandidate class-path-root mod-container source-type is-minecraft classpath))
  (^ModCandidate [^java.io.File class-path-root ^java.io.File mod-container ^net.minecraftforge.fml.common.discovery.ContainerType source-type]
    (new ModCandidate class-path-root mod-container source-type)))

(defn get-mod-container
  "returns: `java.io.File`"
  (^java.io.File [^ModCandidate this]
    (-> this (.getModContainer))))

(defn remember-base-mod-type
  "class-name - `java.lang.String`"
  ([^ModCandidate this ^java.lang.String class-name]
    (-> this (.rememberBaseModType class-name))))

(defn minecraft-jar?
  "returns: `boolean`"
  (^Boolean [^ModCandidate this]
    (-> this (.isMinecraftJar))))

(defn get-class-path-root
  "returns: `java.io.File`"
  (^java.io.File [^ModCandidate this]
    (-> this (.getClassPathRoot))))

(defn get-class-list
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^ModCandidate this]
    (-> this (.getClassList))))

(defn get-contained-mods
  "returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^ModCandidate this]
    (-> this (.getContainedMods))))

(defn get-source-type
  "returns: `net.minecraftforge.fml.common.discovery.ContainerType`"
  (^net.minecraftforge.fml.common.discovery.ContainerType [^ModCandidate this]
    (-> this (.getSourceType))))

(defn remember-mod-candidate-type
  "mod-parser - `net.minecraftforge.fml.common.discovery.asm.ASMModParser`"
  ([^ModCandidate this ^net.minecraftforge.fml.common.discovery.asm.ASMModParser mod-parser]
    (-> this (.rememberModCandidateType mod-parser))))

(defn get-contained-packages
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ModCandidate this]
    (-> this (.getContainedPackages))))

(defn get-remembered-base-mods
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ModCandidate this]
    (-> this (.getRememberedBaseMods))))

(defn explore
  "table - `net.minecraftforge.fml.common.discovery.ASMDataTable`

  returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^ModCandidate this ^net.minecraftforge.fml.common.discovery.ASMDataTable table]
    (-> this (.explore table))))

(defn add-class-entry
  "name - `java.lang.String`"
  ([^ModCandidate this ^java.lang.String name]
    (-> this (.addClassEntry name))))

(defn classpath?
  "returns: `boolean`"
  (^Boolean [^ModCandidate this]
    (-> this (.isClasspath))))

