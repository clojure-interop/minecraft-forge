(ns net.minecraftforge.fml.common.discovery.JarDiscoverer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery JarDiscoverer]))

(defn ->jar-discoverer
  "Constructor."
  (^JarDiscoverer []
    (new JarDiscoverer )))

(defn discover
  "candidate - `net.minecraftforge.fml.common.discovery.ModCandidate`
  table - `net.minecraftforge.fml.common.discovery.ASMDataTable`

  returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^JarDiscoverer this ^net.minecraftforge.fml.common.discovery.ModCandidate candidate ^net.minecraftforge.fml.common.discovery.ASMDataTable table]
    (-> this (.discover candidate table))))

