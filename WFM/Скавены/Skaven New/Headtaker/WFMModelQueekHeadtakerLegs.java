// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelQueekHeadtakerLegs extends ModelBase {
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLegFur_r1;
	private final ModelRenderer rightLeg_r1;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLegFur_r1;
	private final ModelRenderer leftLeg_r1;

	public WFMModelQueekHeadtakerLegs() {
		textureWidth = 64;
		textureHeight = 64;

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-3.0F, 12.0F, 0.0F);
		setRotationAngle(rightLeg, 0.1745F, 0.0F, 0.0F);
		

		rightLegFur_r1 = new ModelRenderer(this);
		rightLegFur_r1.setRotationPoint(-0.1F, -1.0F, 0.0F);
		rightLeg.addChild(rightLegFur_r1);
		setRotationAngle(rightLegFur_r1, -0.436F, 0.0184F, 0.0395F);
		rightLegFur_r1.cubeList.add(new ModelBox(rightLegFur_r1, 0, 41, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.7F, true));

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setRotationPoint(-0.1F, -1.0F, 0.0F);
		rightLeg.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, -0.4363F, 0.0F, 0.0F);
		rightLeg_r1.cubeList.add(new ModelBox(rightLeg_r1, 0, 13, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.25F, true));

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(3.0F, 12.0F, 0.0F);
		setRotationAngle(leftLeg, 0.1745F, 0.0F, 0.0F);
		

		leftLegFur_r1 = new ModelRenderer(this);
		leftLegFur_r1.setRotationPoint(-0.1F, -1.0F, 0.0F);
		leftLeg.addChild(leftLegFur_r1);
		setRotationAngle(leftLegFur_r1, -0.436F, -0.0184F, -0.0395F);
		leftLegFur_r1.cubeList.add(new ModelBox(leftLegFur_r1, 0, 41, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.7F, false));

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setRotationPoint(-0.1F, -1.0F, 0.0F);
		leftLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, -0.4363F, 0.0F, 0.0F);
		leftLeg_r1.cubeList.add(new ModelBox(leftLeg_r1, 0, 13, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.25F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		rightLeg.render(f5);
		leftLeg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}