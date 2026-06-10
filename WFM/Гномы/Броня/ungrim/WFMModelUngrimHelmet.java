// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelUngrimHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmet2;
	private final ModelRenderer mohawk;
	private final ModelRenderer mohawk2;
	private final ModelRenderer mohawk3;
	private final ModelRenderer mohawk4;
	private final ModelRenderer mohawk5;
	private final ModelRenderer mohawk6;
	private final ModelRenderer mohawk7;
	private final ModelRenderer hornLeft;
	private final ModelRenderer hornLeft2;
	private final ModelRenderer hornLeft3;
	private final ModelRenderer hornLeft4;
	private final ModelRenderer hornRight;
	private final ModelRenderer hornRight2;
	private final ModelRenderer hornRight3;
	private final ModelRenderer hornRight4;

	public WFMModelUngrimHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 24.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmet2 = new ModelRenderer(this);
		helmet2.setRotationPoint(3.0F, 0.0F, -3.0F);
		helmet.addChild(helmet2);
		helmet2.cubeList.add(new ModelBox(helmet2, 32, 0, -7.0F, -11.0F, -1.0F, 8, 11, 8, 0.5F, false));

		mohawk = new ModelRenderer(this);
		mohawk.setRotationPoint(0.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk);
		mohawk.cubeList.add(new ModelBox(mohawk, 0, 18, 0.0F, -16.0F, -5.0F, 0, 24, 22, 0.0F, false));

		mohawk2 = new ModelRenderer(this);
		mohawk2.setRotationPoint(1.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk2);
		mohawk2.cubeList.add(new ModelBox(mohawk2, 0, 18, -1.5F, -16.0F, -5.0F, 0, 24, 22, 0.0F, false));

		mohawk3 = new ModelRenderer(this);
		mohawk3.setRotationPoint(2.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk3);
		mohawk3.cubeList.add(new ModelBox(mohawk3, 0, 18, -1.5F, -16.0F, -5.0F, 0, 24, 22, 0.0F, false));

		mohawk4 = new ModelRenderer(this);
		mohawk4.setRotationPoint(3.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk4);
		mohawk4.cubeList.add(new ModelBox(mohawk4, 0, 18, -2.0F, -16.0F, -5.0F, 0, 24, 22, 0.0F, false));

		mohawk5 = new ModelRenderer(this);
		mohawk5.setRotationPoint(1.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk5);
		mohawk5.cubeList.add(new ModelBox(mohawk5, 0, 18, -2.0F, -16.0F, -5.0F, 0, 24, 22, 0.0F, false));

		mohawk6 = new ModelRenderer(this);
		mohawk6.setRotationPoint(2.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk6);
		setRotationAngle(mohawk6, 0.0F, -0.0436F, 0.0F);
		mohawk6.cubeList.add(new ModelBox(mohawk6, 0, 18, -0.5F, -16.0F, -5.0F, 0, 24, 22, 0.0F, false));

		mohawk7 = new ModelRenderer(this);
		mohawk7.setRotationPoint(-1.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk7);
		setRotationAngle(mohawk7, 0.0F, 0.0436F, 0.0F);
		mohawk7.cubeList.add(new ModelBox(mohawk7, 0, 18, -0.5F, -16.0F, -5.0F, 0, 24, 22, 0.0F, false));

		hornLeft = new ModelRenderer(this);
		hornLeft.setRotationPoint(5.0F, -5.0F, -1.0F);
		helmet.addChild(hornLeft);
		hornLeft.cubeList.add(new ModelBox(hornLeft, 53, 57, -1.0F, -2.0F, -1.0F, 2, 4, 4, 0.0F, false));

		hornLeft2 = new ModelRenderer(this);
		hornLeft2.setRotationPoint(1.0F, 0.0F, -1.0F);
		hornLeft.addChild(hornLeft2);
		setRotationAngle(hornLeft2, 0.0F, 0.0F, -0.5672F);
		hornLeft2.cubeList.add(new ModelBox(hornLeft2, 48, 49, -1.0F, -1.5F, 0.5F, 5, 3, 3, 0.0F, false));

		hornLeft3 = new ModelRenderer(this);
		hornLeft3.setRotationPoint(4.0F, 0.0F, -2.0F);
		hornLeft2.addChild(hornLeft3);
		setRotationAngle(hornLeft3, 0.0F, 0.0F, -0.1745F);
		hornLeft3.cubeList.add(new ModelBox(hornLeft3, 50, 43, -1.0F, -1.5F, 3.0F, 4, 2, 2, 0.0F, false));

		hornLeft4 = new ModelRenderer(this);
		hornLeft4.setRotationPoint(4.0F, 0.0F, -1.0F);
		hornLeft3.addChild(hornLeft4);
		setRotationAngle(hornLeft4, 0.0F, 0.0F, -0.1745F);
		hornLeft4.cubeList.add(new ModelBox(hornLeft4, 56, 38, -1.0F, -1.5F, 4.5F, 2, 1, 1, 0.0F, false));

		hornRight = new ModelRenderer(this);
		hornRight.setRotationPoint(-5.0F, -5.0F, 1.0F);
		helmet.addChild(hornRight);
		setRotationAngle(hornRight, 0.0F, 3.1416F, 0.0F);
		hornRight.cubeList.add(new ModelBox(hornRight, 52, 56, -1.0F, -2.0F, -1.0F, 2, 4, 4, 0.0F, false));

		hornRight2 = new ModelRenderer(this);
		hornRight2.setRotationPoint(1.0F, 0.0F, -1.0F);
		hornRight.addChild(hornRight2);
		setRotationAngle(hornRight2, 0.0F, 0.0F, -0.5672F);
		hornRight2.cubeList.add(new ModelBox(hornRight2, 48, 49, -1.0F, -1.5F, 0.5F, 5, 3, 3, 0.0F, false));

		hornRight3 = new ModelRenderer(this);
		hornRight3.setRotationPoint(4.0F, 0.0F, -2.0F);
		hornRight2.addChild(hornRight3);
		setRotationAngle(hornRight3, 0.0F, 0.0F, -0.1745F);
		hornRight3.cubeList.add(new ModelBox(hornRight3, 50, 43, -1.0F, -1.5F, 3.0F, 4, 2, 2, 0.0F, false));

		hornRight4 = new ModelRenderer(this);
		hornRight4.setRotationPoint(4.0F, 0.0F, -1.0F);
		hornRight3.addChild(hornRight4);
		setRotationAngle(hornRight4, 0.0F, 0.0F, -0.1745F);
		hornRight4.cubeList.add(new ModelBox(hornRight4, 56, 38, -1.0F, -1.5F, 4.5F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}