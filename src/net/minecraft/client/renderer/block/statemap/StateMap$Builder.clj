(ns net.minecraft.client.renderer.block.statemap.StateMap$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.statemap StateMap$Builder]))

(defn ->builder
  "Constructor."
  (^StateMap$Builder []
    (new StateMap$Builder )))

(defn with-name
  "builder-property-in - `net.minecraft.block.properties.IProperty`

  returns: `net.minecraft.client.renderer.block.statemap.StateMap$Builder`"
  (^net.minecraft.client.renderer.block.statemap.StateMap$Builder [^StateMap$Builder this ^net.minecraft.block.properties.IProperty builder-property-in]
    (-> this (.withName builder-property-in))))

(defn with-suffix
  "builder-suffix-in - `java.lang.String`

  returns: `net.minecraft.client.renderer.block.statemap.StateMap$Builder`"
  (^net.minecraft.client.renderer.block.statemap.StateMap$Builder [^StateMap$Builder this ^java.lang.String builder-suffix-in]
    (-> this (.withSuffix builder-suffix-in))))

(defn ignore
  "p-178442-1 - `net.minecraft.block.properties.IProperty`

  returns: `net.minecraft.client.renderer.block.statemap.StateMap$Builder`"
  (^net.minecraft.client.renderer.block.statemap.StateMap$Builder [^StateMap$Builder this ^net.minecraft.block.properties.IProperty p-178442-1]
    (-> this (.ignore p-178442-1))))

(defn build
  "returns: `net.minecraft.client.renderer.block.statemap.StateMap`"
  (^net.minecraft.client.renderer.block.statemap.StateMap [^StateMap$Builder this]
    (-> this (.build))))

