(ns net.minecraftforge.fml.common.network.internal.NetworkModHolder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.internal NetworkModHolder]))

(defn ->network-mod-holder
  "Constructor.

  container - `net.minecraftforge.fml.common.ModContainer`
  mod-class - `java.lang.Class`
  acceptable-version-range - `java.lang.String`
  table - `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  (^NetworkModHolder [^net.minecraftforge.fml.common.ModContainer container ^java.lang.Class mod-class ^java.lang.String acceptable-version-range ^net.minecraftforge.fml.common.discovery.ASMDataTable table]
    (new NetworkModHolder container mod-class acceptable-version-range table))
  (^NetworkModHolder [^net.minecraftforge.fml.common.ModContainer container ^net.minecraftforge.fml.common.network.internal.NetworkModHolder$NetworkChecker checker]
    (new NetworkModHolder container checker))
  (^NetworkModHolder [^net.minecraftforge.fml.common.ModContainer container]
    (new NetworkModHolder container)))

(defn accept-version
  "version - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^NetworkModHolder this ^java.lang.String version]
    (-> this (.acceptVersion version))))

(defn check
  "data - `java.util.Map`
  side - `net.minecraftforge.fml.relauncher.Side`

  returns: `boolean`"
  (^Boolean [^NetworkModHolder this ^java.util.Map data ^net.minecraftforge.fml.relauncher.Side side]
    (-> this (.check data side))))

(defn get-local-id
  "returns: `int`"
  (^Integer [^NetworkModHolder this]
    (-> this (.getLocalId))))

(defn get-network-id
  "returns: `int`"
  (^Integer [^NetworkModHolder this]
    (-> this (.getNetworkId))))

(defn get-container
  "returns: `net.minecraftforge.fml.common.ModContainer`"
  (^net.minecraftforge.fml.common.ModContainer [^NetworkModHolder this]
    (-> this (.getContainer))))

(defn set-network-id
  "value - `int`"
  ([^NetworkModHolder this ^Integer value]
    (-> this (.setNetworkId value))))

(defn test-vanilla-acceptance
  ""
  ([^NetworkModHolder this]
    (-> this (.testVanillaAcceptance))))

(defn accepts-vanilla
  "from - `net.minecraftforge.fml.relauncher.Side`

  returns: `boolean`"
  (^Boolean [^NetworkModHolder this ^net.minecraftforge.fml.relauncher.Side from]
    (-> this (.acceptsVanilla from))))

