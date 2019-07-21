(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$DoubleYZRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$DoubleYZRoom]))

(defn ->double-yz-room
  "Constructor.

  p-i-45594-1 - `net.minecraft.util.EnumFacing`
  p-i-45594-2 - `net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition`
  p-i-45594-3 - `java.util.Random`"
  (^StructureOceanMonumentPieces$DoubleYZRoom [^net.minecraft.util.EnumFacing p-i-45594-1 ^net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition p-i-45594-2 ^java.util.Random p-i-45594-3]
    (new StructureOceanMonumentPieces$DoubleYZRoom p-i-45594-1 p-i-45594-2 p-i-45594-3))
  (^StructureOceanMonumentPieces$DoubleYZRoom []
    (new StructureOceanMonumentPieces$DoubleYZRoom )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$DoubleYZRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

