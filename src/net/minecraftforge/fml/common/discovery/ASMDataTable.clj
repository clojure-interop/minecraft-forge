(ns net.minecraftforge.fml.common.discovery.ASMDataTable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery ASMDataTable]))

(defn ->asm-data-table
  "Constructor."
  (^ASMDataTable []
    (new ASMDataTable )))

(defn *get-owner-mod-id
  "mods - `java.util.Set`
  targ - `net.minecraftforge.fml.common.discovery.ASMDataTable$ASMData`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.Set mods ^net.minecraftforge.fml.common.discovery.ASMDataTable$ASMData targ]
    (ASMDataTable/getOwnerModID mods targ)))

(defn get-annotations-for
  "container - `net.minecraftforge.fml.common.ModContainer`

  returns: `com.google.common.collect.SetMultimap<java.lang.String,net.minecraftforge.fml.common.discovery.ASMDataTable$ASMData>`"
  (^com.google.common.collect.SetMultimap [^ASMDataTable this ^net.minecraftforge.fml.common.ModContainer container]
    (-> this (.getAnnotationsFor container))))

(defn get-all
  "annotation - `java.lang.String`

  returns: `java.util.Set<net.minecraftforge.fml.common.discovery.ASMDataTable$ASMData>`"
  (^java.util.Set [^ASMDataTable this ^java.lang.String annotation]
    (-> this (.getAll annotation))))

(defn add-asm-data
  "candidate - `net.minecraftforge.fml.common.discovery.ModCandidate`
  annotation - `java.lang.String`
  class-name - `java.lang.String`
  object-name - `java.lang.String`
  annotation-info - `java.util.Map`"
  ([^ASMDataTable this ^net.minecraftforge.fml.common.discovery.ModCandidate candidate ^java.lang.String annotation ^java.lang.String class-name ^java.lang.String object-name ^java.util.Map annotation-info]
    (-> this (.addASMData candidate annotation class-name object-name annotation-info))))

(defn add-container
  "container - `net.minecraftforge.fml.common.ModContainer`"
  ([^ASMDataTable this ^net.minecraftforge.fml.common.ModContainer container]
    (-> this (.addContainer container))))

(defn register-package
  "mod-candidate - `net.minecraftforge.fml.common.discovery.ModCandidate`
  pkg - `java.lang.String`"
  ([^ASMDataTable this ^net.minecraftforge.fml.common.discovery.ModCandidate mod-candidate ^java.lang.String pkg]
    (-> this (.registerPackage mod-candidate pkg))))

(defn get-candidates-for
  "pkg - `java.lang.String`

  returns: `java.util.Set<net.minecraftforge.fml.common.discovery.ModCandidate>`"
  (^java.util.Set [^ASMDataTable this ^java.lang.String pkg]
    (-> this (.getCandidatesFor pkg))))

