// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelManeaterEmpireHat extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer hat2;
	private final ModelRenderer feather;

	public WFMModelManeaterEmpireHat() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -30.0F, -1.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -6.0F, -10.0F, -7.0F, 12, 12, 12, 0.0F, false));

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, -8.0F, 0.0F);
		head.addChild(hat);
		setRotationAngle(hat, -0.2182F, 0.0F, 0.2182F);
		hat.cubeList.add(new ModelBox(hat, 44, 0, -14.0F, 0.0F, -13.0F, 29, 0, 26, 0.0F, false));

		hat2 = new ModelRenderer(this);
		hat2.setRotationPoint(0.0F, 0.0F, -13.0F);
		hat.addChild(hat2);
		setRotationAngle(hat2, -1.2654F, 0.0F, 0.0F);
		hat2.cubeList.add(new ModelBox(hat2, 39, 50, -22.0F, 0.0F, -15.0F, 37, 0, 15, 0.0F, false));

		feather = new ModelRenderer(this);
		feather.setRotationPoint(0.0F, 2.0F, -2.0F);
		hat.addChild(feather);
		setRotationAngle(feather, -1.7219F, -0.3736F, -0.1239F);
		feather.cubeList.add(new ModelBox(feather, 46, 26, -10.0F, 0.0F, -24.0F, 29, 0, 24, 0.0F, false));
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