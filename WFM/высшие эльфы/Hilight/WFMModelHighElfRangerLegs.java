// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelHighElfRangerLegs extends ModelBase {
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer rightleg2;
	private final ModelRenderer rightleg3;
	private final ModelRenderer rightleg4;
	private final ModelRenderer rightleg5;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer leftleg2;
	private final ModelRenderer leftleg3;
	private final ModelRenderer leftleg4;
	private final ModelRenderer leftleg5;

	public WFMModelHighElfRangerLegs() {
		textureWidth = 64;
		textureHeight = 32;

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 42, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.39F, true));

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedRightLeg.addChild(rightleg2);
		rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 7, -3.9F, -8.25F, -2.0F, 4, 6, 4, 0.55F, true));

		rightleg3 = new ModelRenderer(this);
		rightleg3.setRotationPoint(1.9F, 0.0F, 0.0F);
		bipedRightLeg.addChild(rightleg3);
		setRotationAngle(rightleg3, 0.0F, 0.0F, 0.0262F);
		rightleg3.cubeList.add(new ModelBox(rightleg3, 32, 16, -4.2F, -1.0F, -2.0F, 4, 9, 4, 0.6F, true));

		rightleg4 = new ModelRenderer(this);
		rightleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedRightLeg.addChild(rightleg4);
		rightleg4.cubeList.add(new ModelBox(rightleg4, 0, 0, -2.0F, 8.0F, -2.0F, 4, 4, 4, 0.4F, true));

		rightleg5 = new ModelRenderer(this);
		rightleg5.setRotationPoint(1.9F, 12.0F, -2.4F);
		rightleg4.addChild(rightleg5);
		setRotationAngle(rightleg5, 0.1745F, 0.0F, 0.0F);
		rightleg5.cubeList.add(new ModelBox(rightleg5, 3, 6, -3.9F, -1.0F, -0.7F, 4, 1, 1, 0.3F, true));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 42, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.39F, false));

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(-1.9F, 12.0F, 0.0F);
		bipedLeftLeg.addChild(leftleg2);
		leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 7, -0.1F, -8.25F, -2.0F, 4, 6, 4, 0.55F, false));

		leftleg3 = new ModelRenderer(this);
		leftleg3.setRotationPoint(-1.9F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(leftleg3);
		setRotationAngle(leftleg3, 0.0F, 0.0F, -0.0262F);
		leftleg3.cubeList.add(new ModelBox(leftleg3, 20, 16, 0.2F, -1.0F, -2.0F, 4, 9, 4, 0.6F, false));

		leftleg4 = new ModelRenderer(this);
		leftleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftLeg.addChild(leftleg4);
		leftleg4.cubeList.add(new ModelBox(leftleg4, 0, 0, -2.0F, 8.0F, -2.0F, 4, 4, 4, 0.4F, false));

		leftleg5 = new ModelRenderer(this);
		leftleg5.setRotationPoint(-1.9F, 12.0F, -2.4F);
		leftleg4.addChild(leftleg5);
		setRotationAngle(leftleg5, 0.1745F, 0.0F, 0.0F);
		leftleg5.cubeList.add(new ModelBox(leftleg5, 3, 6, -0.1F, -1.0F, -0.7F, 4, 1, 1, 0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedRightLeg.render(f5);
		bipedLeftLeg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}