(ns net.minecraft.nbt.NBTUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.nbt NBTUtil]))

(defn ->nbt-util
  "Constructor."
  (^NBTUtil []
    (new NBTUtil )))

(defn *create-uuid-tag
  "uuid - `java.util.UUID`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^java.util.UUID uuid]
    (NBTUtil/createUUIDTag uuid)))

(defn *read-block-state
  "tag - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^net.minecraft.nbt.NBTTagCompound tag]
    (NBTUtil/readBlockState tag)))

(defn *get-pos-from-tag
  "tag - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^net.minecraft.nbt.NBTTagCompound tag]
    (NBTUtil/getPosFromTag tag)))

(defn *are-nbt-equals
  "nbt-1 - `net.minecraft.nbt.NBTBase`
  nbt-2 - `net.minecraft.nbt.NBTBase`
  compare-tag-list - `boolean`

  returns: `boolean`"
  (^Boolean [^net.minecraft.nbt.NBTBase nbt-1 ^net.minecraft.nbt.NBTBase nbt-2 ^Boolean compare-tag-list]
    (NBTUtil/areNBTEquals nbt-1 nbt-2 compare-tag-list)))

(defn *get-uuid-from-tag
  "tag - `net.minecraft.nbt.NBTTagCompound`

  returns: `java.util.UUID`"
  (^java.util.UUID [^net.minecraft.nbt.NBTTagCompound tag]
    (NBTUtil/getUUIDFromTag tag)))

(defn *create-pos-tag
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^net.minecraft.util.math.BlockPos pos]
    (NBTUtil/createPosTag pos)))

(defn *read-game-profile-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `com.mojang.authlib.GameProfile`"
  (^com.mojang.authlib.GameProfile [^net.minecraft.nbt.NBTTagCompound compound]
    (NBTUtil/readGameProfileFromNBT compound)))

(defn *write-game-profile
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`
  profile - `com.mojang.authlib.GameProfile`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^net.minecraft.nbt.NBTTagCompound tag-compound ^com.mojang.authlib.GameProfile profile]
    (NBTUtil/writeGameProfile tag-compound profile)))

(defn *write-block-state
  "tag - `net.minecraft.nbt.NBTTagCompound`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^net.minecraft.nbt.NBTTagCompound tag ^net.minecraft.block.state.IBlockState state]
    (NBTUtil/writeBlockState tag state)))

