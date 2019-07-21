(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$WingRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$WingRoom]))

(defn ->wing-room
  "Constructor.

  p-i-45585-1 - `net.minecraft.util.EnumFacing`
  p-i-45585-2 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45585-3 - `int`"
  (^StructureOceanMonumentPieces$WingRoom [^net.minecraft.util.EnumFacing p-i-45585-1 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45585-2 ^Integer p-i-45585-3]
    (new StructureOceanMonumentPieces$WingRoom p-i-45585-1 p-i-45585-2 p-i-45585-3))
  (^StructureOceanMonumentPieces$WingRoom []
    (new StructureOceanMonumentPieces$WingRoom )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$WingRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

