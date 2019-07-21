(ns net.minecraftforge.server.permission.context.ContextKeys
  "Some default context keys, for easier compatibility"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission.context ContextKeys]))

(defn ->context-keys
  "Constructor."
  (^ContextKeys []
    (new ContextKeys )))

(def *-pos
  "Static Constant.

  BlockPos for interacting, breaking and other permissions

  type: net.minecraftforge.server.permission.context.ContextKey<net.minecraft.util.math.BlockPos>"
  ContextKeys/POS)

(def *-target
  "Static Constant.

  The entity can be anything that gets interacted with - a sheep when you try to dye it, skeleton that you attack, etc.

  type: net.minecraftforge.server.permission.context.ContextKey<net.minecraft.entity.Entity>"
  ContextKeys/TARGET)

(def *-facing
  "Static Constant.

  type: net.minecraftforge.server.permission.context.ContextKey<net.minecraft.util.EnumFacing>"
  ContextKeys/FACING)

(def *-area
  "Static Constant.

  type: net.minecraftforge.server.permission.context.ContextKey<net.minecraft.util.math.AxisAlignedBB>"
  ContextKeys/AREA)

(def *-block-state
  "Static Constant.

  type: net.minecraftforge.server.permission.context.ContextKey<net.minecraft.block.state.IBlockState>"
  ContextKeys/BLOCK_STATE)

