// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFWMModelBeastmanGorBody extends ModelBase {
	private final ModelRenderer bodyArmour;
	private final ModelRenderer bodyArmour2;
	private final ModelRenderer puzo;
	private final ModelRenderer puzo_r1;
	private final ModelRenderer spike;
	private final ModelRenderer leftArmArmour;
	private final ModelRenderer leftArmArmour2;
	private final ModelRenderer rightArmArmour;
	private final ModelRenderer rightArmArmour2;

	public WFWMModelBeastmanGorBody() {
		textureWidth = 64;
		textureHeight = 64;

		bodyArmour = new ModelRenderer(this);
		bodyArmour.setRotationPoint(0.0F, -3.1982F, 0.5F);
		bodyArmour.cubeList.add(new ModelBox(bodyArmour, 30, 51, -5.0F, 0.1982F, -3.5F, 10, 6, 7, 0.5F, false));

		bodyArmour2 = new ModelRenderer(this);
		bodyArmour2.setRotationPoint(0.0F, 9.1982F, 0.0F);
		bodyArmour.addChild(bodyArmour2);
		bodyArmour2.cubeList.add(new ModelBox(bodyArmour2, 12, 39, -4.0F, -3.0F, -2.5F, 8, 6, 5, 0.5F, false));

		puzo = new ModelRenderer(this);
		puzo.setRotationPoint(0.0F, -2.0F, 0.0F);
		bodyArmour.addChild(puzo);
		

		puzo_r1 = new ModelRenderer(this);
		puzo_r1.setRotationPoint(0.0F, 11.9053F, -3.5F);
		puzo.addChild(puzo_r1);
		setRotationAngle(puzo_r1, 0.0F, 0.0F, 0.7854F);
		puzo_r1.cubeList.add(new ModelBox(puzo_r1, 0, 0, -3.5F, -3.5F, -1.0F, 7, 7, 2, 0.0F, false));

		spike = new ModelRenderer(this);
		spike.setRotationPoint(0.0F, 0.0F, 0.0F);
		puzo.addChild(spike);
		spike.cubeList.add(new ModelBox(spike, 0, 4, 0.0F, 8.1982F, -9.5F, 0, 7, 5, 0.0F, false));

		leftArmArmour = new ModelRenderer(this);
		leftArmArmour.setRotationPoint(4.5F, -1.5F, 0.5F);
		leftArmArmour.cubeList.add(new ModelBox(leftArmArmour, 29, 16, 0.5F, -1.5F, -2.5F, 3, 5, 5, 0.5F, false));

		leftArmArmour2 = new ModelRenderer(this);
		leftArmArmour2.setRotationPoint(24.5F, 22.5F, -0.5F);
		leftArmArmour.addChild(leftArmArmour2);
		leftArmArmour2.cubeList.add(new ModelBox(leftArmArmour2, 30, 26, -24.0F, -19.0F, -1.5F, 4, 9, 4, 0.5F, false));
		leftArmArmour2.cubeList.add(new ModelBox(leftArmArmour2, 46, 30, -20.0F, -19.0F, 0.5F, 4, 9, 0, 0.0F, false));

		rightArmArmour = new ModelRenderer(this);
		rightArmArmour.setRotationPoint(-4.5F, -1.5F, 0.5F);
		rightArmArmour.cubeList.add(new ModelBox(rightArmArmour, 29, 16, -3.5F, -1.5F, -2.5F, 3, 5, 5, 0.5F, true));

		rightArmArmour2 = new ModelRenderer(this);
		rightArmArmour2.setRotationPoint(19.5F, 22.5F, -0.5F);
		rightArmArmour.addChild(rightArmArmour2);
		rightArmArmour2.cubeList.add(new ModelBox(rightArmArmour2, 30, 26, -24.0F, -19.0F, -1.5F, 4, 9, 4, 0.5F, true));
		rightArmArmour2.cubeList.add(new ModelBox(rightArmArmour2, 46, 30, -28.0F, -19.0F, 0.5F, 4, 9, 0, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bodyArmour.render(f5);
		leftArmArmour.render(f5);
		rightArmArmour.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}