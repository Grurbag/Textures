// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelBeastmanGorLegs extends ModelBase {
	private final ModelRenderer leftLegArmour;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer leftLegArmour2;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer leftLeg6;
	private final ModelRenderer rightLegArmour;
	private final ModelRenderer RightLeg_r3;
	private final ModelRenderer rightLegArmour2;
	private final ModelRenderer RightLeg_r4;
	private final ModelRenderer rightLeg6;

	public WFMModelBeastmanGorLegs() {
		textureWidth = 64;
		textureHeight = 64;

		leftLegArmour = new ModelRenderer(this);
		leftLegArmour.setRotationPoint(-0.1F, 6.9544F, -0.5209F);
		

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(0.1F, 2.0456F, 0.5209F);
		leftLegArmour.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, -0.1745F, 0.0F, 0.0F);
		RightLeg_r1.cubeList.add(new ModelBox(RightLeg_r1, 48, 17, -0.1F, -1.0F, -2.0F, 4, 8, 4, 0.5F, false));

		leftLegArmour2 = new ModelRenderer(this);
		leftLegArmour2.setRotationPoint(28.1F, 17.0456F, 0.5209F);
		leftLegArmour.addChild(leftLegArmour2);
		

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setRotationPoint(-25.0F, -9.0F, 0.0F);
		leftLegArmour2.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.48F, 0.0F, 0.0F);
		RightLeg_r2.cubeList.add(new ModelBox(RightLeg_r2, 50, 29, -2.5F, -1.0F, -2.0F, 3, 6, 4, 0.5F, false));

		leftLeg6 = new ModelRenderer(this);
		leftLeg6.setRotationPoint(0.0F, 0.0F, -1.0F);
		leftLegArmour2.addChild(leftLeg6);
		leftLeg6.cubeList.add(new ModelBox(leftLeg6, 48, 39, -28.0F, -5.5649F, 0.3087F, 4, 6, 4, 0.5F, false));

		rightLegArmour = new ModelRenderer(this);
		rightLegArmour.setRotationPoint(-0.1F, 6.9544F, -0.5209F);
		

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setRotationPoint(0.1F, 2.0456F, 0.5209F);
		rightLegArmour.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, -0.1745F, 0.0F, 0.0F);
		RightLeg_r3.cubeList.add(new ModelBox(RightLeg_r3, 48, 17, -4.1F, -1.0F, -2.0F, 4, 8, 4, 0.5F, true));

		rightLegArmour2 = new ModelRenderer(this);
		rightLegArmour2.setRotationPoint(24.1F, 17.0456F, 0.5209F);
		rightLegArmour.addChild(rightLegArmour2);
		

		RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setRotationPoint(-25.0F, -9.0F, 0.0F);
		rightLegArmour2.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.48F, 0.0F, 0.0F);
		RightLeg_r4.cubeList.add(new ModelBox(RightLeg_r4, 50, 29, -2.5F, -1.0F, -2.0F, 3, 6, 4, 0.5F, true));

		rightLeg6 = new ModelRenderer(this);
		rightLeg6.setRotationPoint(0.0F, 0.0F, -1.0F);
		rightLegArmour2.addChild(rightLeg6);
		rightLeg6.cubeList.add(new ModelBox(rightLeg6, 48, 39, -28.0F, -5.5649F, 0.3087F, 4, 6, 4, 0.5F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leftLegArmour.render(f5);
		rightLegArmour.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}