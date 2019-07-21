(ns net.minecraftforge.fml.common.asm.transformers.TerminalTransformer$ExitVisitor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers TerminalTransformer$ExitVisitor]))

(defn *system-exit-called
  "status - `int`"
  ([^Integer status]
    (TerminalTransformer$ExitVisitor/systemExitCalled status)))

(defn *runtime-exit-called
  "runtime - `java.lang.Runtime`
  status - `int`"
  ([^java.lang.Runtime runtime ^Integer status]
    (TerminalTransformer$ExitVisitor/runtimeExitCalled runtime status)))

(defn *runtime-halt-called
  "runtime - `java.lang.Runtime`
  status - `int`"
  ([^java.lang.Runtime runtime ^Integer status]
    (TerminalTransformer$ExitVisitor/runtimeHaltCalled runtime status)))

(defn visit
  "version - `int`
  access - `int`
  name - `java.lang.String`
  signature - `java.lang.String`
  super-name - `java.lang.String`
  interfaces - `java.lang.String[]`"
  ([^TerminalTransformer$ExitVisitor this ^Integer version ^Integer access ^java.lang.String name ^java.lang.String signature ^java.lang.String super-name interfaces]
    (-> this (.visit version access name signature super-name interfaces))))

(defn visit-method
  "m-access - `int`
  m-name - `java.lang.String`
  m-desc - `java.lang.String`
  m-signature - `java.lang.String`
  m-exceptions - `java.lang.String[]`

  returns: `org.objectweb.asm.MethodVisitor`"
  (^org.objectweb.asm.MethodVisitor [^TerminalTransformer$ExitVisitor this ^Integer m-access ^java.lang.String m-name ^java.lang.String m-desc ^java.lang.String m-signature m-exceptions]
    (-> this (.visitMethod m-access m-name m-desc m-signature m-exceptions))))

