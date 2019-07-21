(ns net.minecraft.tileentity.TileEntitySkull
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.tileentity TileEntitySkull]))

(defn ->tile-entity-skull
  "Constructor."
  (^TileEntitySkull []
    (new TileEntitySkull )))

(defn *set-profile-cache
  "profile-cache-in - `net.minecraft.server.management.PlayerProfileCache`"
  ([^net.minecraft.server.management.PlayerProfileCache profile-cache-in]
    (TileEntitySkull/setProfileCache profile-cache-in)))

(defn *set-session-service
  "session-service-in - `com.mojang.authlib.minecraft.MinecraftSessionService`"
  ([^com.mojang.authlib.minecraft.MinecraftSessionService session-service-in]
    (TileEntitySkull/setSessionService session-service-in)))

(defn *update-gameprofile
  "input - `com.mojang.authlib.GameProfile`

  returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^com.mojang.authlib.GameProfile input]
    (TileEntitySkull/updateGameprofile input)))

(defn set-skull-rotation
  "rotation - `int`"
  ([^TileEntitySkull this ^Integer rotation]
    (-> this (.setSkullRotation rotation))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntitySkull this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))

(defn read-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^TileEntitySkull this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readFromNBT compound))))

(defn get-animation-progress
  "p-184295-1 - `float`

  returns: `float`"
  (^Float [^TileEntitySkull this ^Float p-184295-1]
    (-> this (.getAnimationProgress p-184295-1))))

(defn set-type
  "type - `int`"
  ([^TileEntitySkull this ^Integer type]
    (-> this (.setType type))))

(defn set-player-profile
  "player-profile - `com.mojang.authlib.GameProfile`"
  ([^TileEntitySkull this ^com.mojang.authlib.GameProfile player-profile]
    (-> this (.setPlayerProfile player-profile))))

(defn get-update-tag
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^TileEntitySkull this]
    (-> this (.getUpdateTag))))

(defn update
  ""
  ([^TileEntitySkull this]
    (-> this (.update))))

(defn get-update-packet
  "returns: `net.minecraft.network.play.server.SPacketUpdateTileEntity`"
  (^net.minecraft.network.play.server.SPacketUpdateTileEntity [^TileEntitySkull this]
    (-> this (.getUpdatePacket))))

(defn get-skull-type
  "returns: `int`"
  (^Integer [^TileEntitySkull this]
    (-> this (.getSkullType))))

(defn mirror
  "mirror-in - `net.minecraft.util.Mirror`"
  ([^TileEntitySkull this ^net.minecraft.util.Mirror mirror-in]
    (-> this (.mirror mirror-in))))

(defn get-skull-rotation
  "returns: `int`"
  (^Integer [^TileEntitySkull this]
    (-> this (.getSkullRotation))))

(defn get-player-profile
  "returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^TileEntitySkull this]
    (-> this (.getPlayerProfile))))

(defn rotate
  "rotation-in - `net.minecraft.util.Rotation`"
  ([^TileEntitySkull this ^net.minecraft.util.Rotation rotation-in]
    (-> this (.rotate rotation-in))))

