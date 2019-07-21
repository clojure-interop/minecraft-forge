(ns net.minecraftforge.common.IPlantable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common IPlantable]))

(defn get-plant-type
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraftforge.common.EnumPlantType`"
  (^net.minecraftforge.common.EnumPlantType [^IPlantable this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPlantType world pos))))

(defn get-plant
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^IPlantable this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPlant world pos))))

