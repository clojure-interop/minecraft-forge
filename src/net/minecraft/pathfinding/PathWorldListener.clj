(ns net.minecraft.pathfinding.PathWorldListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding PathWorldListener]))

(defn ->path-world-listener
  "Constructor."
  (^PathWorldListener []
    (new PathWorldListener )))

(defn broadcast-sound
  "sound-id - `int`
  pos - `net.minecraft.util.math.BlockPos`
  data - `int`"
  ([^PathWorldListener this ^Integer sound-id ^net.minecraft.util.math.BlockPos pos ^Integer data]
    (-> this (.broadcastSound sound-id pos data))))

(defn mark-block-range-for-render-update
  "x-1 - `int`
  y-1 - `int`
  z-1 - `int`
  x-2 - `int`
  y-2 - `int`
  z-2 - `int`"
  ([^PathWorldListener this ^Integer x-1 ^Integer y-1 ^Integer z-1 ^Integer x-2 ^Integer y-2 ^Integer z-2]
    (-> this (.markBlockRangeForRenderUpdate x-1 y-1 z-1 x-2 y-2 z-2))))

(defn on-entity-added
  "entity-in - `net.minecraft.entity.Entity`"
  ([^PathWorldListener this ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityAdded entity-in))))

(defn play-sound-to-all-near-except
  "player - `net.minecraft.entity.player.EntityPlayer`
  sound-in - `net.minecraft.util.SoundEvent`
  category - `net.minecraft.util.SoundCategory`
  x - `double`
  y - `double`
  z - `double`
  volume - `float`
  pitch - `float`"
  ([^PathWorldListener this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.SoundCategory category ^Double x ^Double y ^Double z ^Float volume ^Float pitch]
    (-> this (.playSoundToAllNearExcept player sound-in category x y z volume pitch))))

(defn notify-light-set
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^PathWorldListener this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.notifyLightSet pos))))

(defn play-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  type - `int`
  block-pos-in - `net.minecraft.util.math.BlockPos`
  data - `int`"
  ([^PathWorldListener this ^net.minecraft.entity.player.EntityPlayer player ^Integer type ^net.minecraft.util.math.BlockPos block-pos-in ^Integer data]
    (-> this (.playEvent player type block-pos-in data))))

(defn send-block-break-progress
  "breaker-id - `int`
  pos - `net.minecraft.util.math.BlockPos`
  progress - `int`"
  ([^PathWorldListener this ^Integer breaker-id ^net.minecraft.util.math.BlockPos pos ^Integer progress]
    (-> this (.sendBlockBreakProgress breaker-id pos progress))))

(defn play-record
  "sound-in - `net.minecraft.util.SoundEvent`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^PathWorldListener this ^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.math.BlockPos pos]
    (-> this (.playRecord sound-in pos))))

(defn on-entity-removed
  "entity-in - `net.minecraft.entity.Entity`"
  ([^PathWorldListener this ^net.minecraft.entity.Entity entity-in]
    (-> this (.onEntityRemoved entity-in))))

(defn notify-block-update
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  old-state - `net.minecraft.block.state.IBlockState`
  new-state - `net.minecraft.block.state.IBlockState`
  flags - `int`"
  ([^PathWorldListener this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState old-state ^net.minecraft.block.state.IBlockState new-state ^Integer flags]
    (-> this (.notifyBlockUpdate world-in pos old-state new-state flags))))

(defn spawn-particle
  "p-190570-1 - `int`
  p-190570-2 - `boolean`
  p-190570-3 - `boolean`
  p-190570-4 - `double`
  p-190570-6 - `double`
  p-190570-8 - `double`
  p-190570-10 - `double`
  p-190570-12 - `double`
  p-190570-14 - `double`
  p-190570-16 - `int`"
  ([^PathWorldListener this ^Integer p-190570-1 ^Boolean p-190570-2 ^Boolean p-190570-3 ^Double p-190570-4 ^Double p-190570-6 ^Double p-190570-8 ^Double p-190570-10 ^Double p-190570-12 ^Double p-190570-14 ^Integer p-190570-16]
    (-> this (.spawnParticle p-190570-1 p-190570-2 p-190570-3 p-190570-4 p-190570-6 p-190570-8 p-190570-10 p-190570-12 p-190570-14 p-190570-16)))
  ([^PathWorldListener this ^Integer particle-id ^Boolean ignore-range ^Double x-coord ^Double y-coord ^Double z-coord ^Double x-speed ^Double y-speed ^Double z-speed ^Integer parameters]
    (-> this (.spawnParticle particle-id ignore-range x-coord y-coord z-coord x-speed y-speed z-speed parameters))))

