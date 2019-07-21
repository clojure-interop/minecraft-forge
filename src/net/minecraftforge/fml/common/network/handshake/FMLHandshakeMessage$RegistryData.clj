(ns net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage$RegistryData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network.handshake FMLHandshakeMessage$RegistryData]))

(defn ->registry-data
  "Constructor.

  has-more - `boolean`
  name - `net.minecraft.util.ResourceLocation`
  entry - `net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot$Entry`"
  (^FMLHandshakeMessage$RegistryData [^Boolean has-more ^net.minecraft.util.ResourceLocation name ^net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot$Entry entry]
    (new FMLHandshakeMessage$RegistryData has-more name entry))
  (^FMLHandshakeMessage$RegistryData []
    (new FMLHandshakeMessage$RegistryData )))

(defn from-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage$RegistryData this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.fromBytes buffer))))

(defn to-bytes
  "buffer - `io.netty.buffer.ByteBuf`"
  ([^FMLHandshakeMessage$RegistryData this ^io.netty.buffer.ByteBuf buffer]
    (-> this (.toBytes buffer))))

(defn get-id-map
  "returns: `java.util.Map<net.minecraft.util.ResourceLocation,java.lang.Integer>`"
  (^java.util.Map [^FMLHandshakeMessage$RegistryData this]
    (-> this (.getIdMap))))

(defn get-substitutions
  "returns: `java.util.Set<net.minecraft.util.ResourceLocation>`"
  (^java.util.Set [^FMLHandshakeMessage$RegistryData this]
    (-> this (.getSubstitutions))))

(defn get-dummied
  "returns: `java.util.Set<net.minecraft.util.ResourceLocation>`"
  (^java.util.Set [^FMLHandshakeMessage$RegistryData this]
    (-> this (.getDummied))))

(defn get-name
  "returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^FMLHandshakeMessage$RegistryData this]
    (-> this (.getName))))

(defn has-more?
  "returns: `boolean`"
  (^Boolean [^FMLHandshakeMessage$RegistryData this]
    (-> this (.hasMore))))

(defn to-string
  "side - `java.lang.Class`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLHandshakeMessage$RegistryData this ^java.lang.Class side]
    (-> this (.toString side))))

