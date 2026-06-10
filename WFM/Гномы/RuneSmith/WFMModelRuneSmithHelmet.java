// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelRuneSmithHelmet extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer overlay;
	private final ModelRenderer anvil;
	private final ModelRenderer anvil2;
	private final ModelRenderer anvil3;

	public WFMModelRuneSmithHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		overlay = new ModelRenderer(this);
		overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(overlay);
		overlay.cubeList.add(new ModelBox(overlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		anvil = new ModelRenderer(this);
		anvil.setRotationPoint(-1.0F, -7.0F, 0.0F);
		head.addChild(anvil);
		setRotationAngle(anvil, 0.0F, 1.5708F, 0.0F);
		anvil.cubeList.add(new ModelBox(anvil, 0, 23, -6.0F, -4.0F, -1.5F, 12, 4, 5, 0.5F, false));

		anvil2 = new ModelRenderer(this);
		anvil2.setRotationPoint(12.0F, 0.0F, 0.0F);
		anvil.addChild(anvil2);
		anvil2.cubeList.add(new ModelBox(anvil2, 52, 27, -6.0F, -3.0F, -0.5F, 3, 2, 3, 0.5F, false));

		anvil3 = new ModelRenderer(this);
		anvil3.setRotationPoint(-3.0F, 0.0F, 0.0F);
		anvil.addChild(anvil3);
		anvil3.cubeList.add(new ModelBox(anvil3, 39, 27, -6.0F, -3.0F, -0.5F, 3, 2, 3, 0.5F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}