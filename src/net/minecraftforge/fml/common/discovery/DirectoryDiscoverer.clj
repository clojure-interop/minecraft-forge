(ns net.minecraftforge.fml.common.discovery.DirectoryDiscoverer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery DirectoryDiscoverer]))

(defn ->directory-discoverer
  "Constructor."
  (^DirectoryDiscoverer []
    (new DirectoryDiscoverer )))

(defn discover
  "candidate - `net.minecraftforge.fml.common.discovery.ModCandidate`
  table - `net.minecraftforge.fml.common.discovery.ASMDataTable`

  returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^DirectoryDiscoverer this ^net.minecraftforge.fml.common.discovery.ModCandidate candidate ^net.minecraftforge.fml.common.discovery.ASMDataTable table]
    (-> this (.discover candidate table))))

(defn explore-file-system
  "path - `java.lang.String`
  mod-dir - `java.io.File`
  harvested-mods - `java.util.List`
  candidate - `net.minecraftforge.fml.common.discovery.ModCandidate`
  mc - `net.minecraftforge.fml.common.MetadataCollection`"
  ([^DirectoryDiscoverer this ^java.lang.String path ^java.io.File mod-dir ^java.util.List harvested-mods ^net.minecraftforge.fml.common.discovery.ModCandidate candidate ^net.minecraftforge.fml.common.MetadataCollection mc]
    (-> this (.exploreFileSystem path mod-dir harvested-mods candidate mc))))

