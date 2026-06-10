// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelHellGuardBoots extends ModelBase {
	private final ModelRenderer RightBoot;
	private final ModelRenderer nose_r1;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer LeftBoot;
	private final ModelRenderer nose_r2;
	private final ModelRenderer RightLeg_r2;

	public WFMModelHellGuardBoots() {
		textureWidth = 64;
		textureHeight = 64;

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.9F, false));

		nose_r1 = new ModelRenderer(this);
		nose_r1.setRotationPoint(0.8F, 13.0F, -4.0F);
		RightBoot.addChild(nose_r1);
		setRotationAngle(nose_r1, 0.0873F, 0.0F, 0.0F);
		nose_r1.cubeList.add(new ModelBox(nose_r1, 0, 0, -0.4F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));
		nose_r1.cubeList.add(new ModelBox(nose_r1, 9, 0, -2.4F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));
		nose_r1.cubeList.add(new ModelBox(nose_r1, 0, 0, -1.4F, -4.0F, -0.5F, 1, 4, 1, 0.0F, false));

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(0.0F, 11.5F, -3.0F);
		RightBoot.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0873F, 0.0F, 0.0F);
		RightLeg_r1.cubeList.add(new ModelBox(RightLeg_r1, 0, 32, -2.5F, -1.0F, -0.35F, 5, 2, 1, 0.4F, false));

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.9F, true));

		nose_r2 = new ModelRenderer(this);
		nose_r2.setRotationPoint(-1.0F, 13.0F, -4.0F);
		LeftBoot.addChild(nose_r2);
		setRotationAngle(nose_r2, 0.0873F, 0.0F, 0.0F);
		nose_r2.cubeList.add(new ModelBox(nose_r2, 9, 0, -0.4F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));
		nose_r2.cubeList.add(new ModelBox(nose_r2, 0, 0, 1.6F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));
		nose_r2.cubeList.add(new ModelBox(nose_r2, 0, 0, 0.6F, -4.0F, -0.5F, 1, 4, 1, 0.0F, false));

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setRotationPoint(0.0F, 11.5F, -3.0F);
		LeftBoot.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0873F, 0.0F, 0.0F);
		RightLeg_r2.cubeList.add(new ModelBox(RightLeg_r2, 0, 32, -2.5F, -1.0F, -0.35F, 5, 2, 1, 0.4F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		RightBoot.render(f5);
		LeftBoot.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}