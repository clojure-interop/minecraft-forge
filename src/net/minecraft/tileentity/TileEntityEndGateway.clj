(ns net.minecraft.tileentity.TileEntityEndGateway
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntityEndGateway]))

(defn ->tile-entity-end-gateway
  "Constructor."
  (^TileEntityEndGateway []
    (new TileEntityEndGateway )))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityEndGateway this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntityEndGateway this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-cooldown-percent
  "p-184305-1 - `float`

  returns: `float`"
  (^Float [^TileEntityEndGateway this ^Float p-184305-1]
    (-> this (.getCooldownPercent p-184305-1))))

(defn cooling-down?
  "returns: `boolean`"
  (^Boolean [^TileEntityEndGateway this]
    (-> this (.isCoolingDown))))

(defn spawning?
  "returns: `boolean`"
  (^Boolean [^TileEntityEndGateway this]
    (-> this (.isSpawning))))

(defn trigger-cooldown
  ""
  ([^TileEntityEndGateway this]
    (-> this (.triggerCooldown))))

(defn get-update-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntityEndGateway this]
    (-> this (.getUpdateTag))))

(defn get-spawn-percent
  "p-184302-1 - `float`

  returns: `float`"
  (^Float [^TileEntityEndGateway this ^Float p-184302-1]
    (-> this (.getSpawnPercent p-184302-1))))

(defn update
  ""
  ([^TileEntityEndGateway this]
    (-> this (.update))))

(defn get-max-render-distance-squared
  "returns: `double`"
  (^Double [^TileEntityEndGateway this]
    (-> this (.getMaxRenderDistanceSquared))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntityEndGateway this]
    (-> this (.getUpdatePacket))))

(defn set-exact-position
  "p-190603-1 - `net.minecraft.util.math.BlockPos`"
  ([^TileEntityEndGateway this ^net.minecraft.util.math.BlockPos p-190603-1]
    (-> this (.setExactPosition p-190603-1))))

(defn should-render-face?
  "p-184313-1 - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^TileEntityEndGateway this ^net.minecraft.util.EnumFacing p-184313-1]
    (-> this (.shouldRenderFace p-184313-1))))

(defn receive-client-event
  "id - `int`
  type - `int`

  returns: `boolean`"
  (^Boolean [^TileEntityEndGateway this ^Integer id ^Integer type]
    (-> this (.receiveClientEvent id type))))

(defn get-particle-amount
  "returns: `int`"
  (^Integer [^TileEntityEndGateway this]
    (-> this (.getParticleAmount))))

(defn teleport-entity
  "entity-in - `net.minecraft.entity.Entity`"
  ([^TileEntityEndGateway this ^net.minecraft.entity.Entity entity-in]
    (-> this (.teleportEntity entity-in))))

